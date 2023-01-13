package com.university.university.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.university.university.entity.State;
import com.university.university.repository.StateRepository;
import com.university.university.utils.FileUploadUtil;

@RestController
public class StateController {
    
    private StateRepository stateRepository;
    private FileUploadUtil fileUploadUtil;


    public StateController(StateRepository stateRepository,FileUploadUtil fileUploadUtil){
        this.stateRepository = stateRepository;
        this.fileUploadUtil = fileUploadUtil;
    }


    @PostMapping("/api/v1/states")
    public ResponseEntity<State> save(State state,@RequestParam("image") MultipartFile file)throws IOException{


        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        state.setImage(fileName);
        State saveDB = stateRepository.save(state);
        String uploadDir = "states-images/"+saveDB.getId();
        fileUploadUtil.saveFile(uploadDir, fileName, file);



        return ResponseEntity.ok(null);
    }

    @GetMapping("/")
    public String xd(){
        return "XD";
    }

}
