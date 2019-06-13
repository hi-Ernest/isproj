package web.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import javax.jms.Topic;


@Configuration
@EnableJms
public class ActiveMQConfig {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("study.msg.queue");
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("chr");
    }

}
