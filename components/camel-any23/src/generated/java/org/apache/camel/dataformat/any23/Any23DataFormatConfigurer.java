/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.any23;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Any23DataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        Any23DataFormat dataformat = (Any23DataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "extractors": dataformat.setExtractors(property(camelContext, java.util.List.class, value)); return true;
        case "outputformat":
        case "outputFormat": dataformat.setOutputFormat(property(camelContext, org.apache.camel.dataformat.any23.Any23OutputFormat.class, value)); return true;
        case "baseuri":
        case "baseURI": dataformat.setBaseURI(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}
