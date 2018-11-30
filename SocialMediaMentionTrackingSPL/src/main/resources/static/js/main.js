
//Main page component which includes uploading file and admin panel login field.
const mainPageComponent = Vue.component('mainPageComponent',{
	
	data() {
		return {
			uploadResult: '',
			
	}},

	template:
		'<div class="container text-center mt-5">'+
    		'<h2> Plugin... </h2>' +
    		'<div id="app"> <button class="btn btn-primary" type="button" v-on:click="submitFile()">Enable Plugin</button>	</div>'+
    		'<h3>{{uploadResult}} </h3> '+
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
