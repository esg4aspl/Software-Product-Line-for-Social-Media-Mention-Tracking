package com.hy.pluginproject.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;

@RestController
@RequestMapping("/api")
public class MainController {
				

	@RequestMapping("/enablePlugin")
    public void index2() {
		
		System.out.println("Works...");
		
		PluginManager pm = PluginManagerFactory.createPluginManager();
		pm.addPluginsFrom(new File("plugins/").toURI());
		

	}

}
