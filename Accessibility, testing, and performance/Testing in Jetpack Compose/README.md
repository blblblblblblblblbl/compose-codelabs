new for me

test can fail because of animations because of Synchronization

Any test that you write must be properly synchronized with the subject under test. For example, when you use a finder such as onNodeWithText, the test waits until the app is idle before querying the semantics tree. Without synchronization, tests could look for elements before they're displayed or they could wait unnecessarily.

"This is basically telling you that Compose is permanently busy so there is no way to synchronize the app with the test.

You might already have guessed that the problem is the infinite flashing animation. The app is never idle so the test can't continue."