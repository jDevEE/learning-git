package com.learning.git;

import java.io.File;
public final class ResourceReader{

    private ResourceReader(){
    }

    public static File getResource(String animal){
        return new File("/resources/jungle/animals/" + animal );
    }
}
