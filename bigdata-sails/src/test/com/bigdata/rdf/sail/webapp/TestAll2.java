/**
Copyright (C) SYSTAP, LLC 2006-2007.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
/*
 * Created on Nov 7, 2007
 */

package com.bigdata.rdf.sail.webapp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Test suite.
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 * @version $Id: TestAll.java 4908 2011-07-13 19:42:43Z thompsonbry $
 */
public class TestAll2 extends TestCase {

    /**
     * 
     */
    public TestAll2() {
        super();
    }

    /**
     * @param arg0
     */
    public TestAll2(String arg0) {
        super(arg0);
    }

    public static Test suite() {

        final TestSuite suite = new TestSuite("WebApp");

        suite.addTest(TestNanoSparqlServerWithProxyIndexManager2.suite(TestMode.triples));
        
        suite.addTest(TestNanoSparqlServerWithProxyIndexManager2.suite(TestMode.sids));
        
        suite.addTest(TestNanoSparqlServerWithProxyIndexManager2.suite(TestMode.quads));
        
        return suite;

    }

}
