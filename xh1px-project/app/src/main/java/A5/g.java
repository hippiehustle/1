package A5;

import android.content.Context;
import android.view.SubMenu;

/* loaded from: classes.dex */
public final class g extends n.m {

    /* renamed from: A, reason: collision with root package name */
    public final int f339A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f340z;

    public g(Context context, Class cls, int i4) {
        super(context);
        this.f340z = cls;
        this.f339A = i4;
    }

    @Override // n.m
    public final n.o a(int i4, int i8, int i9, CharSequence charSequence) {
        int size = this.f12646f.size() + 1;
        int i10 = this.f339A;
        if (size <= i10) {
            w();
            n.o a3 = super.a(i4, i8, i9, charSequence);
            a3.f(true);
            v();
            return a3;
        }
        String simpleName = this.f340z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i10);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(A.j.r(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // n.m, android.view.Menu
    public final SubMenu addSubMenu(int i4, int i8, int i9, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f340z.getSimpleName().concat(" does not support submenus"));
    }
}
