
# react-native-open-market支持react-native0.63.4及以上

## Getting started

`$ npm install react-native-open-market --save或yarn add react-native-open-market`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.zyh.market.RNMarketPackage;` to the imports at the top of the file
  - Add `new RNMarketPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-open-market'
  	project(':react-native-open-market').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-open-market/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-open-market')
  	```


## Usage
```javascript
import RNMarket from 'react-native-open-market';

// TODO: What to do with the module?
RNMarket;
```
  