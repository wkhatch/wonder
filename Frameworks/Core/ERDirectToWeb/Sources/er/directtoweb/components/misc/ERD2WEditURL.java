/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.directtoweb.components.misc;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WEditString;

/**
 * Used for editing urls.<br />
 * @d2wKey length
 * @d2wKey maxLength
 */
public class ERD2WEditURL extends D2WEditString {

    public ERD2WEditURL(WOContext context) { super(context); }
}
