package com.mumoshu.patterns;

public abstract class Callbackable<Data> {
	/* publicにしないとinner classでoverrideできないので。 */
	public Callbackable(){
		onInit();
	};
	/* publicにしないとinner classでoverrideできないので。 */
	public void onInit() {};
	/* publicにしないとinner classでoverrideできないので。interfaceの場合はあえて明示しなくてもいいらしい  */
	public abstract void callback(Data data);
}
