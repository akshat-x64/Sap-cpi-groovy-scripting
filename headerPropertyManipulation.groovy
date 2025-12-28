import com.sap.gateway.ip.core.customdev.util.Message;
    
    def Message processData(Message message) {
        def total_header = message.getHeaders()
        def total_property = message.getProperties()

        def oldHeader = total_header.get("oldHeader") as Integer
        def oldProperty  = total_property.get("oldProperty") as Integer
        int   aa  =  oldHeader + oldProperty
        message.setProperty("aa",aa);
        return message;
        }
    
        
