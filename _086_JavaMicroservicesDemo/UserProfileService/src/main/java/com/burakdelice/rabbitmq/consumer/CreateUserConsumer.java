package com.burakdelice.rabbitmq.consumer;

import com.burakdelice.rabbitmq.model.SaveAuthModel;
import com.burakdelice.repository.entity.UserProfile;
import com.burakdelice.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserConsumer {

    private final UserProfileService userProfileService;

    @RabbitListener(queues = "queue-auth")
    public void createFromQueue(SaveAuthModel model) {

        userProfileService.saveRabbit(model);

//        userProfileService.save(
//                UserProfile.builder()
//                        .authid(model.getAuthid())
//                        .username(model.getUsername())
//                        .email(model.getEmail())
//                        .build()
//        );
    }
}
