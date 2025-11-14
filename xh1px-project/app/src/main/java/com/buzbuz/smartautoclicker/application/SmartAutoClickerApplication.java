package com.buzbuz.smartautoclicker.application;

import V5.f;
import W0.c;
import X5.b;
import Z.g;
import android.app.Application;
import android.content.ComponentName;
import b1.AbstractC0522a;
import c1.h;
import c1.k;
import i1.C0879a;
import kotlin.Metadata;
import o6.j;
import r5.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/application/SmartAutoClickerApplication;", "Landroid/app/Application;", "<init>", "()V", "smartautoclicker_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SmartAutoClickerApplication extends Application implements b {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9760d = false;

    /* renamed from: e, reason: collision with root package name */
    public final f f9761e = new f(new c(25, this));

    /* renamed from: f, reason: collision with root package name */
    public C0879a f9762f;

    @Override // X5.b
    public final Object a() {
        return this.f9761e.a();
    }

    public final void b() {
        if (!this.f9760d) {
            this.f9760d = true;
            this.f9762f = (C0879a) ((h) ((k) this.f9761e.a())).f9470c.get();
        }
        super.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    @Override // android.app.Application
    public final void onCreate() {
        b();
        ComponentName componentName = AbstractC0522a.f9049a;
        C0879a c0879a = this.f9762f;
        if (c0879a != null) {
            c0879a.f11750a = "com.buzbuz.smartautoclicker";
            ComponentName componentName2 = AbstractC0522a.f9049a;
            j.e(componentName2, "componentName");
            c0879a.f11751b = componentName2;
            ComponentName componentName3 = AbstractC0522a.f9050b;
            j.e(componentName3, "componentName");
            c0879a.f11752c = componentName3;
            int[] iArr = e.f14413a;
            registerActivityLifecycleCallbacks(new Object());
            return;
        }
        j.i("appComponentsManager");
        throw null;
    }
}
