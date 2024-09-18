package Services;

import Dto.SignupRequest;
import Model.UserM;

public interface AuthServiceM {

	UserM createUserM(SignupRequest signupRequest);

}
