package com.company.design.proxy;

public class BrowserProxy implements iBrowser{

    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;
    }

    public BrowserProxy(String url, Object before, Object o) {
    }

    @Override
    public Html show() {
        if(html == null){
            this.html = new Html((url));;
            System.out.println("BrowserProxy loading html from : "+url);
        }
        System.out.println("BrowserProxy user cache html : "+url);
        return null;
    }
}
