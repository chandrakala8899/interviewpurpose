package com.neoteric.java_29102024.polyphismwithabstract;

public  abstract class AngularWebsite  implements Webpage{

    @Override
    public String header() {
        return "header";
    }

    @Override
    public String footer() {
        return "footer";
    }

    public abstract String body();
    public String page(){
       StringBuilder builder = new StringBuilder();
       builder.append(header());
       builder.append(body());
       builder.append(footer());
       return builder.toString();
    }

}
