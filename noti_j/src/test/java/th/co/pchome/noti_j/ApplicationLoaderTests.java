package th.co.pchome.noti_j;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import th.co.pchome.noti_j.enums.PushNotiPlatformEnum;
import th.co.pchome.noti_j.enums.PushNotiTargetEnum;
import th.co.pchome.noti_j.enums.PushNotiTypeEnum;
import th.co.pchome.noti_j.service.PushNotiService;
import th.co.pchome.noti_j.vo.PushNotiFormDto;
import th.co.pchome.noti_j.vo.PushTokenVo;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationLoaderTests {

    @Autowired
    private PushNotiService pushNotiService;

    /**
     * 新增 Push notification，在測試發送後，送交審核
     */
    @Test
    public void testSubmitPushNotification() {

//        String backendUser = "orange";
//
//        // Push notification表單資料
//        PushNotiFormDto pushNotiForm = new PushNotiFormDto();
//        pushNotiForm.setPlatform(PushNotiPlatformEnum.iOS.getValue());
//        pushNotiForm.setNotiType(PushNotiTypeEnum.MARKETING.getValue());
//        pushNotiForm.setTarget(PushNotiTargetEnum.SPECIFIC.getValue());
//        pushNotiForm.setRecipients("0999777111,orange@staff.pchome.co.th,0999777222");
//        pushNotiForm.setSendDate("2019/06/30");
//        pushNotiForm.setSendHour("12");
//        pushNotiForm.setSendMin("30");
//        pushNotiForm.setThTitle("第一次測試 標題泰文");
//        pushNotiForm.setThContent("第一次測試 內容泰文");
//        pushNotiForm.setEnTitle("第一次測試 標題英文");
//        pushNotiForm.setEnContent("第一次測試 內容英文");
//        pushNotiForm.setTwTitle("第一次測試 標題中文");
//        pushNotiForm.setTwContent("第一次測試 內容中文");
//        pushNotiForm.setLink("https://www.pchome.co.th/");
//
//        // 檢查資料是否合法
//        boolean isValid = pushNotiService.validateData(pushNotiForm);
//        Assert.assertTrue(isValid);
//
//        // 新增 Push notification
//        long pushId = pushNotiService.createPushNoti(pushNotiForm, backendUser);
//        Assert.assertNotEquals(0, pushId);
//
//        // 透過會員帳號查詢其Push token
//        String recipients = "0999777111,orange@staff.pchome.co.th,0999777222";
//
//        List<PushTokenVo> pushTokenVoList = pushNotiService.queryPushTokenListByUserIds(recipients);
//        Assert.assertNotNull(pushTokenVoList);
//
//        // 發送測試推播
//        boolean sentOk = pushNotiService.sendPushNotiForTest(pushTokenVoList, pushId);
//        Assert.assertTrue(sentOk);
//
//        // 送交審核
//        boolean submitOk = pushNotiService.submitToReview(pushId);
//        Assert.assertTrue(submitOk);
    }
}