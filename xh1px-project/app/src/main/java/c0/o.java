package c0;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9402a;

    public o(Context context, int i4) {
        switch (i4) {
            case 1:
                this.f9402a = context;
                return;
            default:
                this.f9402a = context.getApplicationContext();
                return;
        }
    }

    @Override // c0.j
    public void a(E2.d dVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0558a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new m(this, dVar, threadPoolExecutor, 0));
    }
}
