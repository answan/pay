
package phoneseller.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="reward", url="${api.url.reward}")
public interface RewardService {

    @RequestMapping(method= RequestMethod.POST, path="/rewards")
    public void payCancel(@RequestBody Reward reward);

}