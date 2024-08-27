package kg.end_pont.gitpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/git")
public class GitPracticeController {


                        /*
                        1) git checkout -b {Имя вашей ветки} develop
                        2) git commit -am "ваш комментарий"
                        3) git checkout {ветка выше}
                        4) git merge --no-ff {имя вашей ветки}
                        5) git push origin {ветка выше}
                        6) git push origin {ветка ваша}
                         */

    /*
      2) TASK_1:  Добавить контроллер get который будет принимать 2 целочисленных параметра и суммировать их
      2) TASK_2:  Добавить контроллер get который будет принимать 2 целочисленных параметра и отнимать их
      2) TASK_3:  Добавить контроллер get который будет принимать 2 целочисленных параметра и умножать их
      2) TASK_4:  Добавить контроллер get который будет принимать 2 целочисленных параметра и делить их
      2) TASK_5:  Добавить контроллер get который будет принимать 2 целочисленных параметра и сравнивать их
      2) TASK_6:  Добавить контроллер get который будет принимать 2 целочисленных параметра и делить по модулю их
     */
}
