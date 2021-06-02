package com.dlsc.jfxcentral.data;

import javafx.beans.property.ObjectProperty;
import javafx.scene.image.Image;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests the existence of the MANDATOR images, e.g. news banner, library icon, etc...
 * Some model objects have OPTIONAL images, e.g. a "person".
 */
@ExtendWith(ApplicationExtension.class)
public class ImageManagerTest {

    @BeforeAll
    public static void setup() {
        DataRepository.ASYNC = false;
        DataRepository.BASE_URL = "file://" + System.getProperty("user.dir") + "/";
    }

    @Test
    public void shouldGetNewsBanner() {
        // when .. then
        DataRepository.getInstance().getNews().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().newsBannerImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetDownloadBanner() {
        // when .. then
        DataRepository.getInstance().getDownloads().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().downloadBannerImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetBlogPageImage() {
        // when .. then
        DataRepository.getInstance().getBlogs().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().blogPageImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetBlogPageLargeImage() {
        // when .. then
        DataRepository.getInstance().getBlogs().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().blogPageLargeImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetRealWorldImage() {
        // when .. then
        DataRepository.getInstance().getRealWorldApps().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().realWorldAppImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetRealWorldImageLarge() {
        // when .. then
        DataRepository.getInstance().getRealWorldApps().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().realWorldAppLargeImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetToolImage() {
        // when .. then
        DataRepository.getInstance().getTools().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().toolImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetCompanyImage() {
        // when .. then
        DataRepository.getInstance().getCompanies().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().companyImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetBookCoverImage() {
        // when .. then
        DataRepository.getInstance().getBooks().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().bookCoverImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }

    @Test
    public void shouldGetYouTubImage() {
        // when .. then
        DataRepository.getInstance().getVideos().forEach(item -> {
            ObjectProperty<Image> property = ImageManager.getInstance().youTubeImageProperty(item);
            assertNotNull(property, "image property is null");
            assertNotNull(property.get(), "image is missing");
        });
    }
}
