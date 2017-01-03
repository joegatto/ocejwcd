# ocejwcd
Java EE 6 Web Component Developer Certified Expert 1Z0-899

**************************************************************************************************************************
**********************                              Chapter 1                                       **********************
**************************************************************************************************************************

Notes:
- IP (Internet Protocol) is a specification which defined addresses for each individual computer attached to the internet.
- IPv4 is capable of handle 4.2 billion machines. It is comprised of four parts, each part being a number between 0 and 255, separated by "." and consumes 32 bits. Example: 123.123.123.123
- IPv6 supports 3.4 * 10^38 machines. It is comprised of eight parts, each number being a hexadecimal number between 0 and FFFF, separated by ":" and consumes 128 bits. Example: 3F4:8A4D:992:0:FE12:419:19:417A.
- DNS (Domain Name System) provides a mapping between domain names like nailsandfixings.com and IP addresses like 102.17.206.192.

- URI (Uniform Resource Identifier) provides a mechanism to distinguish  things belonging to one entity from those belonging to another. URI are abstract quantities, we cannot create a URI directly.
- General format for the URI is: scheme:hierarchy[?query][#fragmentid] where the bracketed sections are optional.

- For URL (Uniform Resource Locator), the hierarchy is composed of two further parts: //authority/path. 
  - In practice, the authority is a server name or address, optionally containing user and port therefore takes the general form: [@user]host[:port].
  - The path is the location of the resource within the authority.
  - Below we have a familiar construction of a typical URL: http://www.nailsandfixings.com:8080/catalogue?part=4563
    - In the example above, http is the scheme.
	- www.nailsandfixings.com:8080 is the authority
	- catalogue is the path
	- path=4563 is the query string.
	
- For URN (Uniform Resource Name) the structure may be unfamiliar but is quite simple. urn:namespace:otherdata
  - The scheme for a URN is always urn.
  - The namespace is specific to a single entity or organization.

Every domain can be registered to only one entity.

The client-server model, the two important parties in the transfer of networked information are the computer requesting information (client) and the machine assigned with the duty of providing that information (server).

In order to deliver data from one endpoint to another we need to use a standard, well-accepted protocol.

The most common is TCP/IP:
  - TCP (Transmission Control Protocol) is responsible for the packing and unpacking of data between the client and server.
  - IP (Internet Protocol) is a method of describing the location of the end points along the connection pathway.

HTTP (Hypertext Transfer Protocol):
  - Requests and responses
  - HTTP Methods
  - HTTP Status Code
  - Cookies

Requests and responses
  - When the client needs to get a resource on a server, it must first makes a request for it.
    - Send a packet of HTTP data, part of which contains the identification of the resource being requested.
  - Once the server receives the request, it will attempt to send the request data back to the client in the form of response.
    - Contains location data (URL) and all the bytes from the requested resource.

  - Header and Bodies
    - Both requests and responses have two sections to them: header and body.
    - The header contains metadata about the request being requested. 

HTTP Methods
- The GET Method
  - The GET method is used to request the retrieval of a resource from a server
  - Used when the client is requesting a resource be returned from the server and the client does not wish to provide any additional parameters or information to upload.
  - Does not contain any HTTP body data since the only data required by the server is the URI to the resource.
  - It may however supply some supplementary data using the attributed encoded in the form of a query string, using a question mark to begin the sequence and ampersands (&) to separate the parameters.

- The POST Method
  - The POST method is used primarily when there is a lot of data to be transferred.
  - We can use POST to upload files.
  - We use POST over GET in two situations:
    - Large amount of data to transmit.
    - 'Hiding' data

- The HEAD Method
  - Using this method the client will be able to obtain all of the headers for a resource before getting hold of it.
  - The header contains metadata about the actual resource.
  - It's defined to use the headers of GET method.

- The OPTIONS Method
  - This method will return a response which contains a list of all the methods supported by a server and the resource being requested.

- The PUT Method
  - Used to place resources onto the server.
  - The body of the method will contain the data of the resource being uploaded and an extra header (the location on the server to place the resource).
  - This method returns:
    - 200 (OK) if the resource is stored.
    - 204 (No content) if the resource was not placed on the server.
    - 201 (Created) if the resource is new to the server.
  - The PUT request differs from POST because it contains the Request-URI header field.
  - A PUT request is not recommended for a simple data transfer.

- The DELETE Method
  - Used to remove resources from the server using the DELETE method.
  - There are some securities considerations in the use of this method.
  - The body of this method is usually empty.

- The TRACE Method
  - Used when a client needs to verify if a server is working properly.
  - What is requested to the server is reflected back in the response.
  - Usually used for debugging process.

- The CONNECT Method
  - Is reserved for future use in the RFC-2616.

HTTP Status Codes
- HTTP gives some feedback as to how the request has been processed.
- Comes in the form of HTTP status codes.
- Each status code is sent in an HTTP response and used by the client to determine what to do next.
- Each status code is a number which is three digits long.
  - The first indicates the status class.
  - The last two are used to identify the exact status type within a general category.

- Informational (1xx)
  - Are reported during a connection with the client, but do not signify the termination of the request.

- Successful (2xx)
  - Indicates that the request has been successfully completed.

- Redirection (3xx)
  - Indicates that the requested resource has been moved somewhere else and no, longer resides at the requested location.

- Client Error (4xx)
  - Are generated and returned when an error has occurred on the part of the client making the request.

- Server Error (5xx)
  - Are generated when the server fails to respond correctly.

Cookies
- Used on the internet to maintain persistence of a users's settings beetween visits to a website.
- Cookies are small text files stored on the client machine.
- Contain information sent to the server, so they are a temporary form of persistent storage.
- User is free to modify or delete them.
- User agent may not support cookies or the user may have disabled them.
- The availability and integrity of cookies can never be guaranteed.
- Security:
  - Cookies are stored based upon the domain, sub-domain and path.

**************************************************************************************************************************
**********************                              Chapter 2                                      ***********************
**************************************************************************************************************************

There are two main uses of Java EE platform:
  - To provide business services such as database storage and transaction processing for clients operating on a network.
  - To provide web front-ends and business services to clients using the biggest network of all: the internet.

A Web Component is defined in the Java EE specification to be either a servlet or a JSP.

A Web Application is a collection of Web Components.

The Web Container is where all Web applications are managed and executed.

Web Application Context is a virtual divide between one application and another.Each application has its own unique context root.

There are two methods to use when deploying an application:
- Upload all files unpackaged to the server, creating directories where necessary and arranging files separately.
- Package all related application file into a single WAR (Web Application Archive) file and upload this single file.

WAR Files
- Similar to a JAR file in composition but it has a well-defined content structure.
- Contains all the files for a single application and the metadata which describes the application to the container.
  
Context Path
- Context root is unique for each application.
- One servlet can call another using one of two URL formats:
  - Relative URLs: Have no opening forward slash and are interpreted relative to the path of the calling servlet.
  - Context-Relative URLs: Are based on the context of the application, not the location of the servlet.
  
WAR Structure
- It is deployed to a context relative to the Web server.
- When files are appended to the context root for the application, the path of a resource inside the WAR becomes the URL of that resource.
- There is a special directory called WEB-INF, this is required for a WAR to be valid.
- The WEB-INF directory
  - This directory is private in nature, accessible only to the Web container in which application is deployed.
  - WEB-INF/classes/ is used for the storage of all compiled classes required by the application.
  - WEB-INF/lib/ is used to place JAR libraries of classes in this subdirectory.
  - WEB-INF/tags/ is used for the storage of JSP tag files.
  
The Deployment Descriptor
- The WEB-INF/web.xml file is required to be present in every application archive.
- It's a XML-formatted deployment descriptor and provides metadata information about the application and WAR to the container.

Key Java EE Web Components   
- Servlets: The key building block for any Web Application.
- JavaServer Pages: JSPs are essentially dynamic documents. It is written like a standard HTML or XML document but with embedded Java code.
- Tag Libraries: Those are essentially Java classes which encapsulate standard functionality required by multiple JSP components. 

**************************************************************************************************************************
**********************                              Chapter 3                                       **********************
**************************************************************************************************************************

Servlet is a Java class that implements javax.servlet.Servlet interface.

A servet at its most basic must implement the javax.servlet.Servlet interface, but there is an abstract class called javax.servlet.GenericServlet that provides functionally but it's protocol-independent.

Since HTTP is the most known web protocol, the API includes a specific implementation to handle this kind of protocol, javax.servlet.http.HttpServlet.

Servlet Life Cycles
At run time, a servlet goes through the following 5 stages:
- Before the class can be used, it must be loaded by the application class loader.
- When the container call the servlet, it needs to be instantiated like any other Java class.
- Then the servlet needs to be initialized with the servlet information, performed by the init method.
- At this stage the servlet is on service period, i.e. it's able to handle requests and responses.
- Finally servlet can be destroyed.

The last stage is normally performed when the server is shut-down, the application is undeployed or there are no requests to a servlet for a long period of time.

Servlet Class Loading
- Each application has its own class loader.
- The class is loaded before being instantiated for the first time.
- A servlet in one application cannot communicate with a servlet in another application.

Servlet Instantiation
- Each servlet must be instantiated by the container in a generic way, since the container doesn't know what protocol the servlet supports.
- It used the default (no-argument) constructor to create a servlet instance.

Initialization
- Each servlet must provide an implementation of the following method defined in the Servlet interface:
  - void init(ServletConfig): Initializes the servlet to its default state.
  - The GenericServlet class, implements this method and save the ServletConfig parameter as a private attribute inside the servlet.
  - And also defines one more initialization method: void init().
- Initialization Exceptions
  - During the call to init() method, the servlet can throw exceptions.
  - The most common being because a required persistent storage mechanism is offline and configuration cannot be retrieved.
  - Required initialization parameters cannot be found or are not valid.
  - If an exception occurs:
    - The container will not continue to initialize.
    - Will not run this instance of the servlet.
    - Will be moved directly to the last stage of life cycle.
    - The destroy method will not be called.
  - The init() method can throw an UnavailableException which marks a component as being 'offline'.
  
The destroy method
- The destruction of a servlet occurs with garbage collectors. So we cannot be sure when it will be destroyed.
- The container requests that the servlet be destroyed. And the destroy() method is called.
  - destroy() method is used to release some extra resources.

Requesting Servicing
- Since the container must provide support for any protocol used by the servlet. The Servlet interfaces define one single method for servicing requests: void service(ServletRequest, ServletResponse)
  - It is used when a request of any type and of any protocol) is made to the servlet.
  
HTTP Servlets
- HTTP Request Servicing
  - There are two interface in the javax.servlet.http package:
    - HttpServletRequest extends ServletRequest
    - HttpServletResponse extends ServletResponse
- An HTTP request to an HttpServlet goes through the steps:
  - A call to the public service(ServletRequest, ServletResponse).
  - Delegation of this call to HttpServlet's protected method.
  - The protected method service(HttpServletRequest, HttpServletResponse) delegates to the appropriate doXxx method.

**************************************************************************************************************************
**********************                              Chapter 4                                       **********************
**************************************************************************************************************************
Servlet Contexts
- Retrieve information about the location of the application being executed.
- Dynamically query the Java EE server to find another application currently running on the server.
- Retrieve and modify application-scoped attributes and initialisation parameters.
- Obtain handles on InputStream for the importation of static resources.
- Create a RequestDispatcher object 

Context Attributes
- Are variable that needs to be accessible to all components in the applications.
- There are 4 scopes for context attributes:
  - Application
  - Request
  - Session
  - Page

