// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// @RequestMapping("/users")
// public class UserController {

//     @PostMapping("/add")
//     public String addUser(@ModelAttribute("user") User user) {
//         // Process the user object obtained from the request body
//         System.out.println("Received user: " + user.getUsername() + ", " + user.getPassword());

//         // Perform some logic with the user data (e.g., save to a database)

//         // Redirect to a success page or return a response
//         return "redirect:/success";
//     }

//     // Additional methods and mappings can be added here
// }
