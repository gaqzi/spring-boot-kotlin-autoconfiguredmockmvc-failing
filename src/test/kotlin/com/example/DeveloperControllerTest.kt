package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class DeveloperControllerTest {
    @Autowired
    lateinit var mvc: MockMvc

    @Test
    @Throws(Exception::class)
    fun createNewDeveloper() {
        mvc.perform(
                post("/api/v1/developers")
                        .param("username", "boaty")
                        .param("email", "boaty@mcboatface.org")
                        .param("password", "123loveboats")
                        .param("passwordConfirmation", "123loveboats"))
                .andExpect(status().isCreated)
    }
}
