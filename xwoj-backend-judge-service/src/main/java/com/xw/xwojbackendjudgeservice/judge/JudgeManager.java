package com.xw.xwojbackendjudgeservice.judge;

import com.xw.xwojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.xw.xwojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.xw.xwojbackendjudgeservice.judge.strategy.JudgeContext;
import com.xw.xwojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.xw.xwojbackendmodel.model.codesandbox.JudgeInfo;
import com.xw.xwojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
