package com.point.app.user;

import com.point.app.exceptions.UserAlreadyExistException;

import com.point.app.images.Image;
import com.point.app.images.ImageService;
import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Controller
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    public final UserService userService;
    public final ImageService imageService;

    @GetMapping(path = "{userId}")
    public User getUserById(@PathVariable long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/registration")
    public String registrationSubmit(@ModelAttribute User user) throws UserAlreadyExistException {
        userService.saveUser(user);
        return "redirect:/login";
    }

    @PostMapping("/profileImage")
    public String saveProfileImage(@RequestParam("image") MultipartFile file) throws IOException {
        userService.saveProfileImage(file);
        return "redirect:/";
    }
}