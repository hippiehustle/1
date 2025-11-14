package e0;

import android.text.Editable;
import c0.x;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f10575a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0633a f10576b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f10577c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f10577c;
        if (cls != null) {
            return new x(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
