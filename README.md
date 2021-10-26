# socket-stream

The code in this repository provides a socket server and client implemented using akka streams
and demonstrates a problem on MacOS that does not occur on Linux
when opening many clients to a socket server.

To demonstrate the problem, run the SocketClientStreamTest. 
The last test, "Test with actor" attempts to make segmentCount connections.
If segmentCount is greater than 400, it fails on my MacOS Sierra (virtual machine),
but passes on Linux (PopOS 21.04).

I modified the system limits: (See launchctl command and https://support.apple.com/en-us/HT202528)

>  launchctl limit
cpu         unlimited      unlimited      
filesize    unlimited      unlimited      
data        unlimited      unlimited      
stack       8388608        67104768       
core        0              unlimited      
rss         unlimited      unlimited      
memlock     unlimited      unlimited      
maxproc     5000           5000           
maxfiles    64000          524288     

> sysctl -a | grep kern.maxprocperuid
kern.maxprocperuid: 10000

> nvram boot-args
boot-args	serverperfmode=1

But that did not help.

The JDK in use on the Mac is: 

openjdk version "11.0.12" 2021-07-20
OpenJDK Runtime Environment Temurin-11.0.12+7 (build 11.0.12+7)
OpenJDK 64-Bit Server VM Temurin-11.0.12+7 (build 11.0.12+7, mixed mode)

On Linux:

openjdk version "11.0.11" 2021-04-20
OpenJDK Runtime Environment (build 11.0.11+9-Ubuntu-0ubuntu2)
OpenJDK 64-Bit Server VM (build 11.0.11+9-Ubuntu-0ubuntu2, mixed mode, sharing)
