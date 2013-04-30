========================================================================================================================
README - Spring in Practice Top-Level POM

Copyright (c) 2013 Manning Publications Co.

Willie Wheeler (willie.wheeler@gmail.com)

Book: http://manning.com/wheeler/
Blog: http://springinpractice.com/
Code: https://github.com/springinpractice
========================================================================================================================

This is the top-level POM for Spring in Practice. All of the code examples in the book derive from this POM.

Here are what the various modules are for:

sip-api:

  DAO framework code and utility classes. The DAO "framework" is pretty minimal (just a generic interface and abstract
  implementation). It's fine for simple uses. If you're looking for something more industrial-strength, you will want to
  check out Spring Data JPA.

sip-hibernate:

  Various Hibernate-, transaction- and ORM-related dependencies. The only point of this module is to declare
  dependencies as a convenience to other POMs that want those same dependencies.

sip-jpa:

  Various dependencies for Spring Data JPA. Most of the book is built around the Hibernate DAOs, but there are some
  recipes that show how to use Spring Data JPA instead. Again this module simply defines dependencies.

sip-skin:

  A common skin that we use across several other recipes (though not all of them) via the Maven WAR plugin's overlay
  mechanism. See http://maven.apache.org/plugins/maven-war-plugin/overlays.html for more info on this.

sip-web:

  Another dependency-only module, this time for web-related dependencies.
