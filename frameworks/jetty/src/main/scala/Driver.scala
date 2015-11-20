package com.lot9

import java.awt.Desktop
import java.net.URI

import org.eclipse.jetty.server.Handler
import org.eclipse.jetty.server.handler.{HandlerList, ResourceHandler}
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext

object Driver
{
	def main(args: Array[String])
	{
		// create server object
		val server = new Server(8080)
		
		// configure resource handler
		val resource_handler = new ResourceHandler()
		resource_handler.setDirectoriesListed(true)
		resource_handler.setWelcomeFiles( Array[String]("index.html") )
        resource_handler.setResourceBase("./src/main/webapp/")
		
		// set list of handlers
		val handlers = new HandlerList()
		handlers.setHandlers( Array[Handler](resource_handler) )
		server.setHandler(handlers)
		
		// run server
		server.start()
		server.join()
	}
}
