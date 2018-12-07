
//Main page component which includes uploading file and admin panel login field.
const mainPageComponent = Vue.component('mainPageComponent',{
	
	data() {
		return {
			uploadResult: '',
			getFeedsResult: '',
			feeds: ''
			
	}},

	template:
		'<div class="container text-center mt-5">'+
    		'<h2> Plugin... </h2>' +
    		'<div id="app"> <button class="btn btn-primary" type="button" v-on:click="submitFile()">Enable Plugin</button>	</div>'+
    		'<h3>{{uploadResult}} </h3> '+
    		'<div id="app"> <button class="btn btn-primary" type="button" v-on:click="getFeeds()">Get Feeds</button>	</div>'+
    		'<h3>{{getFeedsResult}} </h3> '+
    		
    		'<div>'+
		    	
		   		'<ul style="list-style-type:none;"> <div> <li v-for="feed in feeds" style="border-style: solid;">' + 
		   				
		   			'<b>Link:</b> {{feed.link}} </br>' +
		   			'<b>Title:</b> {{feed.title}} </br>' +
		   			'<b>PublishedDate:</b> {{feed.publishedDate}} </br>' +
		   			
		   		'</li> </div> </ul>'+
		   	
		   	'</div>',	
	  	
	methods: {

			submitFile: function() {

				this.$http.post( 'api/enablePlugin')
				.then(response => {
					this.uploadResult = "Plugin enabled successfully.";
					console.log("Plugin enabled successfully.");
					
				}, error => {
					this.uploadResult = "Error...";
					console.log("Error...");
				}) 
				
			},
			
			getFeeds: function() {

				this.$http.get( 'api/getFeeds')

				.then(response => {
					console.log(response)
					
					this.getFeedsResult = "Feeds are get successfully...";
					var feedAsString = response.bodyText;
					
					var feedsJSON = JSON.parse(feedAsString);

					
					
					this.feeds = feedsJSON;
					
					console.log("Feeds are get successfully...");
										
				}, error => {
					this.getFeedsResult = "Error...";
					console.log("Error...");				
				})
				
			},

		}
	
});


//Routes for whenever URL changes, these components will be loaded to inside <router-view> </router-view> in index.html.
const routes = [
	{ path: '/', component: mainPageComponent},
];

const router = new VueRouter({
	routes,
});

var mainVue = new Vue({
	el: '#app',
	router
});	
