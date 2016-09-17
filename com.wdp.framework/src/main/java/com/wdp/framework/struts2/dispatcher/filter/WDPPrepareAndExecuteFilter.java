package com.wdp.framework.struts2.dispatcher.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;


/**
 * This is a wrapper of {@link StrutsPrepareAndExecuteFilter} which handles both the preparation and execution phases of the Struts dispatching process.
 * This filter is better to use when you don't have another filter that needs access to action context information, such as Sitemesh.
 * @author Shreyos
 * @version
 * @since
 * @see {@link StrutsPrepareAndExecuteFilter} , {@link FilterDispatcher} .
 *
 */
public class WDPPrepareAndExecuteFilter extends StrutsPrepareAndExecuteFilter {

	/* (non-Javadoc)
	 * @see org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter#destroy()
	 */
	/**
	 * Called by the web container to indicate to a filter that it is being taken out of service. This method is only called once all threads within the filter's doFilter method have exited or after a timeout period has passed. 
	 * After the web container calls this method, it will not call the doFilter method again on this instance of the filter. <br/>
	 * This method gives the filter an opportunity to clean up any resources that are being held (for example, memory, file handles, threads) 
	 * and make sure that any persistent state is synchronized with the filter's current state in memory.

	 */
	@Override
	public void destroy() {
		try{
			System.out.println("WDPPrepareAndExecuteFilter destroying.");
			//Calling super class destroy().
			super.destroy();
			System.out.println("WDPPrepareAndExecuteFilter destroyed sucessfully.");
		}catch(Exception e){
			System.err.println("WDPPrepareAndExecuteFilter error occurred during life cycle destroy , Exception : " + e.getStackTrace());
		}
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	/**
	 * The doFilter method of the Filter is called by the container each time a request/response pair is passed through the chain due to a client request for a resource at the end of the chain. The FilterChain passed in to this method allows the Filter to pass on the request and response to the next entity in the chain.
	 * A typical implementation of this method would follow the following pattern :- <br/>
		1. Examine the request. <br/>
		2. Optionally wrap the request object with a custom implementation to filter content or headers for input filtering. <br/>
		3. Optionally wrap the response object with a custom implementation to filter content or headers for output filtering. <br/> 
		4. a) Either invoke the next entity in the chain using the FilterChain object (chain.doFilter()), <br/>
		4. b) or not pass on the request/response pair to the next entity in the filter chain to block the request processing. <br/>
		5. Directly set headers on the response after invocation of the next entity in the filter chain.
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException, ServletException {
		try{
			//Calling super class doFilter().
			super.doFilter(req, res, chain);
			System.out.println("WDPPrepareAndExecuteFilter executed sucessfully.");
		}catch(IOException ioe){
			System.err.println("WDPPrepareAndExecuteFilter execution error , IOException : " + ioe.getStackTrace());
			throw ioe;
		}catch(ServletException se){
			System.err.println("WDPPrepareAndExecuteFilter execution error , ServletException : " + se.getStackTrace());
			throw se;
		}catch(Exception e){
			System.err.println("WDPPrepareAndExecuteFilter execution error , Exception : " + e.getStackTrace());
		}
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter#init(javax.servlet.FilterConfig)
	 */
	/**
	 * Called by the web container to indicate to a filter that it is being placed into service. 
	 * The servlet container calls the init method exactly once after instantiating the filter. 
	 * The init method must complete successfully before the filter is asked to do any filtering work. <br/>
	 * The web container cannot place the filter into service if the init method either :- <br/>
		1.Throws a ServletException. <br/>
		2.Does not return within a time period defined by the web container. <br/>
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {		
		try{
			System.out.println("WDPPrepareAndExecuteFilter initializing.");
			//Calling super class init().
			super.init(filterConfig);
			System.out.println("WDPPrepareAndExecuteFilter initialized sucessfully.");
		}catch(ServletException se){
			System.err.println("WDPPrepareAndExecuteFilter initialization error , ServletException : " + se.getStackTrace());
			throw se;
		}catch(Exception e){
			System.err.println("WDPPrepareAndExecuteFilter initialization error , Exception : " + e.getStackTrace());
		}
	}
}
