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
        String startByVoyelle = "art" ;
        Assertions.assertThat(javaService.transformToJavanais(startByVoyelle)).isEqualTo("avart");
    }

    @Test
    public void add_av_between_consonne_and_voyelle(){
        String consonneSuivieVoyelle = "chante" ;
        Assertions.assertThat(javaService.transformToJavanais(consonneSuivieVoyelle)).isEqualTo("chavantave");
    }

    @Test
    public void no_addition_of_av_case_no_consonne_followed_by_voyelle(){
        String sansConsonneSuivieVoyelle = "grrr" ;
        Assertions.assertThat(javaService.transformToJavanais(sansConsonneSuivieVoyelle)).isEqualTo("grrr");
    }

}
