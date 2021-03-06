package com.huawei.openstack4j.openstack.cloudeye.internal;

import static com.huawei.openstack4j.core.transport.ClientConstants.*;

import java.util.List;

import com.huawei.openstack4j.api.cloudeye.MetricService;
import com.huawei.openstack4j.model.cloudeye.Metric;
import com.huawei.openstack4j.openstack.cloudeye.domain.CloudEyeMetric;

public class CloudEyeMetricServiceImpl extends BaseCloudEyeServices implements MetricService {

	@Override
	public List<? extends Metric> getList() {
		return get(CloudEyeMetric.CloudEyeMetrics.class, uri(PATH_METRICS)).execute().getList();
	}

	@Override
	public List<? extends Metric> getList(MetricFilterOptions options) {
		return get(CloudEyeMetric.CloudEyeMetrics.class, uri(PATH_METRICS)).params(options.getOptions()).execute()
				.getList();
	}

	@Override
	public List<? extends Metric> getFavoriteList() {
		return get(CloudEyeMetric.CloudEyeMetrics.class, uri(PATH_FAVORITE_METRICS)).execute().getList();
	}
}
