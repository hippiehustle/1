package V5;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import g0.AbstractComponentCallbacksC0755y;

/* loaded from: classes.dex */
public final class j extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public LayoutInflater f6440a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f6441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        super(context);
        context.getClass();
        B0.b bVar = new B0.b(1, this);
        this.f6440a = null;
        abstractComponentCallbacksC0755y.f11103T.a(bVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f6441b == null) {
            if (this.f6440a == null) {
                this.f6440a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f6441b = this.f6440a.cloneInContext(this);
        }
        return this.f6441b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(LayoutInflater layoutInflater, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        super(r0);
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        B0.b bVar = new B0.b(1, this);
        this.f6440a = layoutInflater;
        abstractComponentCallbacksC0755y.f11103T.a(bVar);
    }
}
