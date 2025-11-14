package M;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3278e;

    public /* synthetic */ e(String str, Context context, Object obj, int i4, int i8) {
        this.f3274a = i8;
        this.f3275b = str;
        this.f3276c = context;
        this.f3278e = obj;
        this.f3277d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3274a) {
            case 0:
                Object[] objArr = {(d) this.f3278e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return h.b(this.f3275b, this.f3276c, Collections.unmodifiableList(arrayList), this.f3277d);
            default:
                try {
                    return h.b(this.f3275b, this.f3276c, (List) this.f3278e, this.f3277d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
