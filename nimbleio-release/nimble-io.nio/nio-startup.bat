java -Xms128m -Xmx512m -verbose:gc -Xloggc:gc.log -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=6667,suspend=n -cp .;.\lib\*; com.generallycloud.nio.extend.startup.NIOServerStartup