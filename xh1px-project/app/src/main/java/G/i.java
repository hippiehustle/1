package G;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1665a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f1666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1667c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f1665a = colorStateList;
        this.f1666b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f1667c = hashCode;
    }
}
