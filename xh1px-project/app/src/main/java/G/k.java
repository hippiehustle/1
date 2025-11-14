package G;

import L7.C0150h;
import Z5.y;
import android.graphics.Typeface;
import i.ExecutorC0875n;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1672f;

    public /* synthetic */ k(Object obj, int i4, Object obj2) {
        this.f1670d = i4;
        this.f1671e = obj;
        this.f1672f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorC0875n executorC0875n;
        switch (this.f1670d) {
            case 0:
                ((b) this.f1671e).h((Typeface) this.f1672f);
                return;
            case 1:
                ((C0150h) this.f1671e).D((M7.e) this.f1672f);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((T7.e) ((T7.f) this.f1671e)).g((T7.b) this.f1672f, y.f7506a);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                executorC0875n = (ExecutorC0875n) this.f1671e;
                Runnable runnable = (Runnable) this.f1672f;
                executorC0875n.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                }
            default:
                Runnable runnable2 = (Runnable) this.f1671e;
                executorC0875n = (ExecutorC0875n) this.f1672f;
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
