package com.sm.poleemploi.api;

import com.sm.poleemploi.service.JavanaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class JavanaisController {

        @Autowired
        @Qualifier("javaService")
        private JavanaisService javaService;

        @CrossOrigin(origins = "*", maxAge = 3600)
        @RequestMapping(method = RequestMethod.GET, value ="transformation/{str}",produces = "application/json;charset=UTF-8")
        public ResponseEntity transformToJavanais(@PathVariable final String str) {
            return new ResponseEntity(javaService.transformToJavanais(str), HttpStatus.OK) ;
        }

        @CrossOrigin(origins = "*", maxAge = 3600)
        @RequestMapping(method = RequestMethod.GET, value ="rollback/{str}",produces = "application/json;charset=UTF-8")
        public ResponseEntity retourDepuisJavanais(@PathVariable final String str) {
                return new ResponseEntity(javaService.retourDepuisJavanais(str), HttpStatus.OK) ;
        }

}
