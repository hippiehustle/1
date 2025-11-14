package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import c0.AbstractC0559b;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496g implements InterfaceC0508t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8842d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8843e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8844f;

    public C0496g(c0.l lVar, InterfaceC0508t interfaceC0508t) {
        o6.j.e(lVar, "defaultLifecycleObserver");
        this.f8843e = lVar;
        this.f8844f = interfaceC0508t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        Handler handler;
        switch (this.f8842d) {
            case 0:
                c0.l lVar = (c0.l) this.f8843e;
                switch (AbstractC0495f.f8841a[enumC0503n.ordinal()]) {
                    case 1:
                        lVar.getClass();
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        lVar.getClass();
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        EmojiCompatInitializer emojiCompatInitializer = lVar.f9395e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            handler = AbstractC0559b.a(Looper.getMainLooper());
                        } else {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        handler.postDelayed(new Object(), 500L);
                        lVar.f9394d.f(lVar);
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        lVar.getClass();
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        lVar.getClass();
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        lVar.getClass();
                        break;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                InterfaceC0508t interfaceC0508t = (InterfaceC0508t) this.f8844f;
                if (interfaceC0508t != null) {
                    interfaceC0508t.a(interfaceC0510v, enumC0503n);
                    return;
                }
                return;
            case 1:
                if (enumC0503n == EnumC0503n.ON_START) {
                    ((C0512x) this.f8843e).f(this);
                    ((A.i) this.f8844f).l();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0491b) this.f8844f).f8828a;
                List list = (List) hashMap.get(enumC0503n);
                Object obj = this.f8843e;
                C0491b.a(list, interfaceC0510v, enumC0503n, obj);
                C0491b.a((List) hashMap.get(EnumC0503n.ON_ANY), interfaceC0510v, enumC0503n, obj);
                return;
        }
    }

    public C0496g(InterfaceC0509u interfaceC0509u) {
        this.f8843e = interfaceC0509u;
        C0493d c0493d = C0493d.f8833c;
        Class<?> cls = interfaceC0509u.getClass();
        C0491b c0491b = (C0491b) c0493d.f8834a.get(cls);
        this.f8844f = c0491b == null ? c0493d.a(cls, null) : c0491b;
    }

    public C0496g(A.i iVar, C0512x c0512x) {
        this.f8843e = c0512x;
        this.f8844f = iVar;
    }
}
