package com.sm.poleemploi.service;

import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestJavanaisService {

    @Spy
    @InjectMocks
    private JavanaisService javaService = new JavanaisService();

    @Test
    public void add_av_onbeginning_when_start_by_voyelle(){
        Assertions.assertThat(javaService.transformToJavanais("art")).isEqualTo("avart");
    }

    @Test
    public void add_av_between_consonne_and_voyelle(){
        Assertions.assertThat(javaService.transformToJavanais("chante")).isEqualTo("chavantave");
    }

    @Test
    public void add_av_between_consonne_and_voyelle_and_start_by_voyelle(){
        Assertions.assertThat(javaService.transformToJavanais("exemple")).isEqualTo("avexavemplave");
    }

    @Test
    public void no_addition_of_av_case_no_consonne_followed_by_voyelle(){
        Assertions.assertThat(javaService.transformToJavanais("grrr")).isEqualTo("grrr");
    }

    @Test
    public void return_initial_word_before_transform_javanais(){
        Assertions.assertThat(javaService.retourDepuisJavanais("avexavemplave")).isEqualTo("exemple");
    }

}
