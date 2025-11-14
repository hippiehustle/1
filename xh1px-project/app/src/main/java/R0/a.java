package R0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f4990d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4991a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4992b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f4993c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f4992b = str.concat("/");
        } else {
            this.f4992b = str;
        }
        this.f4993c = map;
        if (!(callback instanceof View)) {
            this.f4991a = null;
        } else {
            this.f4991a = ((View) callback).getContext().getApplicationContext();
        }
    }
}
