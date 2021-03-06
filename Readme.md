# Myo-Glass-Messaging-Service

This system here uses the MYO companion app and controls the glass completely through gestures. This app is primarily a prototype built to demonstrate messaging templates for gestures.

Messages can be triggered with gestures. Messages are also converted from text to speech using gestures. This functionality might help the mute communicate in an easier way.

## Myo Glass Companion Protocol Input

Uses Glass Companion Bluetooth protocol to connect to Google Glass Explorer Edition and control the native ui/interface using the &copy;Myo Gesture Control Armband (thalmic.com/myo).

This is a basic proof of concept and should not be considered the best practice for a gesture based HUD interface. Gesture are mapped directly the comparable gestures on the Glass trackpad. For example, swipe right to swipe the card to the right:

|Myo Pose       | Glass Touchpad Command|
|---------------|-----------------------|
|Double Tap     | Unlock Myo            |
|Wave Right     | Swipe Right           |
|Wave Left      | Swipe Left            |
|Fist           | Tap/Select            |
|Fingers Spread | Swipe Down/Go Back    |

##How to use:
1. Ensure MyGlass app and background processes are not running (Kill from Android Application Manager).
1. Compile, install and run.
1. Myo and Glass will be found automatically if you have paired with them before. In this case, skip steps 4 and 5.
1. Press 'Choose Myo' to connect to your Myo device.
1. Press 'Choose Glass' to connect to your Glass device. Glass must be paired to continue.
1. Perform the 'Unlock' pose (Double-Tap) to enable Myo control of Glass for two seconds, turning the app's icon from gray (off/neutral) to blue (active). When Myo is unlocked, additional gestures will continue to allow Myo to control Glass for 2 seconds.
1. Gestures should be shown on phone UI, and commands send to the Glass device. Glass must be awake/active to respond to touch commands.

##Limitations:
- Currently no way to wake Glass up from Myo gestures.
- Glass features that rely on a phone connection (such as GPS) will not work since the MyGlass application cannot be running at the same time.

## Thanks

Using GlassBluetoothLibrary found here:
[https://github.com/thorikawa/GlassBluetoothProtocol]

Also thanks to examples/work from [@thorikawa](https://github.com/thorikawa) from GlassRemote project:
[https://github.com/thorikawa/GlassRemote]

## License

The Myo Glass Companion project is licensed using the modified BSD license. For more details, please see LICENSE.txt.
