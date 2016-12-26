# ocejwcd
Java EE 6 Web Component Developer Certified Expert 1Z0-899

Notes:
- IP (Internet Protocol) is a specification which defined addresses for each individual computer attached to the internet.
- IPv4 is capable of handle 4.2 billion machines. It is comprised of four parts, each part being a number between 0 and 255, separated by "." and consumes 32 bits. Example: 123.123.123.123
- IPv6 supports 3.4 * 10^38 machines. It is comprised of eight parts, each number being a hexadecimal number between 0 and FFFF, separated by ":" and consumes 128 bits. Example: 3F4:8A4D:992:0:FE12:419:19:417A.
- DNS (Domain Name System) provides a mapping between domain names like nailsandfixings.com and IP addresses like 102.17.206.192.

- URI (Uniform Resource Identifier) provides a mechanism to distinguish  things belonging to one entity from those belonging to another. URI are abstract quantities, we cannot create a URI directly.
- General format for the URI is: scheme:hierarchy[?query][#fragmentid] where the bracketed sections are optional.

- For URL (Uniform Resource Locator), the hierarchy is composed of two further parts: //authority/path. 
  - In practice, the authority is a server name or addresss, optionally containing user and port therefore takes the general form: [@user]host[:port].
  - The path is the location of the resource within the authority.
  - Below we have a familiar construction of a typical URL: http://www.nailsandfixings.com:8080/catalogue?part=4563
    - In the example above, http is the scheme.
	- www.nailsandfixings.com:8080 is the authority
	- catalogue is the path
	- path=4563 is the query string.
	
- For URN (Uniform Resource Name) the structure may be unfamiliar but is quite simple. urn:namespace:otherdata
  - The scheme for a URN is always urn.
  - The namespace is specific to a single entity or organisation.

Every domain can be registered to only one entity.


The cliente-server model, the two important parties in the transfer of networked information are the computer requesting information (client) and the machine assigned with the duty of providing that information (server).

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
  - Used when the client is requesting a resource be returned from the server and the client does not wish to provide any aditional parameters or information to upload.
  - Does not contain any HTTP body data since the only data required by the server is the URI to the resource.
  - It may however supply some supplmentary data using the attributed encoded in the form of a query string, using a question mark to begin the sequence and ampersands (&) to separate the parameters.

- The POST Method
  - The POST method is used primarily when there is a lot of data to be transferred.
  - We can use POST to upload files.
  - We use POST over GET in two situations:
    - Large amount of data to transmit.
    - 'Hiding' data
