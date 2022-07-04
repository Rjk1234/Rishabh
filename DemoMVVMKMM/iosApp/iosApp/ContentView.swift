import SwiftUI
import MultiPlatformLibrary

struct ContentView: View {
    var loginVMHelper = LoginViewModelHelper()

	var body: some View {
		//Text(greet)
        Text("Hello world")
        Button("Login") {
            loginVMHelper.loginW()
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
