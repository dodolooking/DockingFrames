package bibliothek.layouts;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Icons {
    private static Map<String, Icon> icons = new HashMap<String, Icon>();
    
    static{
        load( "xml", "xml.png" );
        load( "binary", "binary.png" );
        load( "load", "load.png" );
        
        load( "add factory", "add_factory.png" );
        load( "remove factory", "remove_factory.png" );
        
        load( "add dockable", "add_dockable.png" );
        load( "remove dockable", "remove_dockable.png" );
    }
    
    private static void load( String id, String path ){
        URL url = Icons.class.getResource( "/data/icons/" + path );
        ImageIcon icon = new ImageIcon( url );
        icons.put( id, icon );
    }
    
    public static Icon get( String id ){
        return icons.get( id );
    }
}
