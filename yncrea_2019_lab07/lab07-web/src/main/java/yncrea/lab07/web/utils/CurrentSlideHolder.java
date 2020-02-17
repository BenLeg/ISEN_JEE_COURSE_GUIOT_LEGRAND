package yncrea.lab07.web.utils;

import yncrea.lab07.web.dto.Slide;

public class CurrentSlideHolder {

    private Slide slide;

    private CurrentSlideHolder(){}

    private static CurrentSlideHolder currentSlideHolder = new CurrentSlideHolder();

    public static CurrentSlideHolder getInstance() {
        if (currentSlideHolder == null) {
            currentSlideHolder = new CurrentSlideHolder();
        }
        return currentSlideHolder;
    }

    public Slide getCurrentSlide() {
        return this.slide;
    }

    public void setCurrentSlide(Slide slide) {
        this.slide = slide;
    }
}
