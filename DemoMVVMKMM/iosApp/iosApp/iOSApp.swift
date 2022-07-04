import SwiftUI
import MultiPlatformLibrary

@main
struct iOSApp: App {
    init() {
        KoinHelperKt.configureKoin()        
    }
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
