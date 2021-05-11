  
import { Linking, Platform, NativeModules } from 'react-native'

const RNMarketCommentModule = NativeModules.RNMarketModule
export default function OpenAppStore(appId) {
    if (Platform.OS === 'ios') {
        const url = `itms-apps://itunes.apple.com/cn/app/id${appId}?mt=8`
        return Linking.openURL(url).catch(err => console.error('An error occurred', err))
    }
    RNMarketCommentModule.openAppStore()
}