  
import { Linking, Platform, NativeModules } from 'react-native'

const RNMarketCommentModule = NativeModules.RNMarketCommentModule
export default function openAppStore(appId) {
    if(!appId) return
    if (Platform.OS === 'ios') {
        const url = `itms-apps://itunes.apple.com/cn/app/id${appId}?mt=8&action=write-review`
        return Linking.openURL(url).catch(err => console.error('An error occurred', err))
    }
    RNMarketCommentModule.openAppStore()
}