//import net.thunderklaus.GwtPlugin._

name := "$name$"
 
autoScalaLibrary := false

crossPaths := false
 
seq(webSettings: _*)

//seq(gwtSettings: _*)

//gwtVersion := "2.4.0"

resolvers += "Vaadin add-ons repository" at "http://maven.vaadin.com/vaadin-addons"

// basic dependencies
libraryDependencies ++= Seq(
  "com.vaadin" % "vaadin-server" % "7.0.0.beta7",
  "com.vaadin" % "vaadin-client-compiled" % "7.0.0.beta7",
  "com.vaadin" % "vaadin-client" % "7.0.0.beta7",
  "com.vaadin" % "vaadin-themes" % "7.0.0.beta7",
  "javax.servlet" % "servlet-api" % "2.4",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.4.v20111024" % "container"
)

libraryDependencies ++= Seq(
	//Add add-ons from the directory here. e.g.
	//"org.vaadin.addons" % "ratingstars" % "1.4"
)

//gwtModules := List("$package$.$classname$Widgetset")

// more correct place would be to compile widgetset under the target dir and configure jetty to find it from there 
//gwtTemporaryPath := file(".") / "src" / "main" / "webapp" / "VAADIN" / "widgetsets"