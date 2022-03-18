package com.example.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChatController {

    private final List<InputChat> alleMeldinger = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreMelding(InputChat inputMelding){
        alleMeldinger.add(inputMelding);
    }

    @GetMapping("/hentAlle")
    public List<InputChat> hentAlle(){
        return alleMeldinger;
    }

}
