/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the resource record set to create or delete.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ResourceRecordSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceRecordSet implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain you want to perform the action on.
     * </p>
     * <p>
     * Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally include a
     * trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name that you specify
     * is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code> (without a trailing dot)
     * and <code>www.example.com.</code> (with a trailing dot) as identical.
     * </p>
     * <p>
     * For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     * (hyphen) and how to specify internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     * <code>*.example.com</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     * <code>prod*.example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The * can't replace any of the middle labels, for example, marketing.*.example.com.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include * in any position other than the leftmost label in a domain name, DNS treats it as an * character
     * (ASCII 42), not as a wildcard.
     * </p>
     * <important>
     * <p>
     * You can't use the * wildcard for resource records sets that have a type of NS.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You can use the * wildcard as the leftmost label in a domain name, for example, <code>*.example.com</code>. You
     * can't use an * for one of the middle labels, for example, <code>marketing.*.example.com</code>. In addition, the
     * * must replace the entire label; for example, you can't specify <code>prod*.example.com</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The DNS record type. For information about different record types and how data is encoded for them, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS Resource
     * Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of weighted, latency, geolocation,
     * or failover resource record sets, specify the same value for all of the resource record sets in the group.
     * </p>
     * <p>
     * Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> | <code>MX</code> |
     * <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <note>
     * <p>
     * SPF records were formerly used to verify the identity of the sender of email messages. However, we no longer
     * recommend that you create resource record sets for which the value of <code>Type</code> is <code>SPF</code>. RFC
     * 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email, Version 1</i>, has been updated
     * to say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.
     * </p>
     * </note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CloudFront distributions:</b> <code>A</code>
     * </p>
     * <p>
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your distribution,
     * one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 buckets:</b> <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that you're
     * creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An identifier that differentiates among
     * multiple resource record sets that have the same combination of DNS name and type. The value of
     * <code>SetIdentifier</code> must be unique for each resource record set that has the same combination of DNS name
     * and type. Omit <code>SetIdentifier</code> for any other types of record sets.
     * </p>
     */
    private String setIdentifier;
    /**
     * <p>
     * <i>Weighted resource record sets only:</i> Among resource record sets that have the same combination of DNS name
     * and type, a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the
     * current resource record set. Amazon Route 53 calculates the sum of the weights for the resource record sets that
     * have the same combination of DNS name and type. Amazon Route 53 then responds to queries based on the ratio of a
     * resource's weight to the total. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must specify a value for the <code>Weight</code> element for every weighted resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per weighted resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create latency, failover, or geolocation resource record sets that have the same values for the
     * <code>Name</code> and <code>Type</code> elements as weighted resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a maximum of 100 weighted resource record sets that have the same values for the <code>Name</code>
     * and <code>Type</code> elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * For weighted (but not weighted alias) resource record sets, if you set <code>Weight</code> to <code>0</code> for
     * a resource record set, Amazon Route 53 never responds to queries with the applicable value for that resource
     * record set. However, if you set <code>Weight</code> to <code>0</code> for all resource record sets that have the
     * same combination of DNS name and type, traffic is routed to all resources with equal probability.
     * </p>
     * <p>
     * The effect of setting <code>Weight</code> to <code>0</code> is different when you associate health checks with
     * weighted resource record sets. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html">Options for
     * Configuring Amazon Route 53 Active-Active and Active-Passive Failover</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private Long weight;
    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that this
     * resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or an ELB load
     * balancer, and is referred to by an IP address or a DNS domain name, depending on the record type.
     * </p>
     * <note>
     * <p>
     * Creating latency and latency alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency resource
     * record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is associated with the
     * selected resource record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per latency resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only create one latency resource record set for each Amazon EC2 Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53 will
     * choose the region with the best latency from among the regions that you create latency resource record sets for.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as latency resource record sets.
     * </p>
     * </li>
     * </ul>
     */
    private String region;
    /**
     * <p>
     * <i>Geo location resource record sets only:</i> A complex type that lets you control how Amazon Route 53 responds
     * to DNS queries based on the geographic origin of the query. For example, if you want all queries from Africa to
     * be routed to a web server with an IP address of <code>192.0.2.111</code>, create a resource record set with a
     * <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of <code>AF</code>.
     * </p>
     * <note>
     * <p>
     * Creating geolocation and geolocation alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * If you create separate resource record sets for overlapping geographic regions (for example, one resource record
     * set for a continent and one for a country on the same continent), priority goes to the smallest geographic
     * region. This allows you to route most queries for a continent to one resource and to route queries for a country
     * on that continent to a different resource.
     * </p>
     * <p>
     * You can't create two geolocation resource record sets that specify the same geographic location.
     * </p>
     * <p>
     * The value <code>*</code> in the <code>CountryCode</code> element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements.
     * </p>
     * <important>
     * <p>
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't mapped to geographic
     * locations, so even if you create geolocation resource record sets that cover all seven continents, Amazon Route
     * 53 will receive some DNS queries from locations that it can't identify. We recommend that you create a resource
     * record set for which the value of <code>CountryCode</code> is <code>*</code>, which handles both queries that
     * come from locations for which you haven't created geolocation resource record sets and queries from IP addresses
     * that aren't mapped to a location. If you don't create a <code>*</code> resource record set, Amazon Route 53
     * returns a "no answer" response for queries from those locations.
     * </p>
     * </important>
     * <p>
     * You can't create non-geolocation resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as geolocation resource record sets.
     * </p>
     */
    private GeoLocation geoLocation;
    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code> element to
     * two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In addition, you
     * include the <code>HealthCheckId</code> element and specify the health check that you want Amazon Route 53 to
     * perform for each resource record set.
     * </p>
     * <p>
     * Except where noted, the following failover behaviors assume that you have included the <code>HealthCheckId</code>
     * element in both resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon Route
     * 53 responds to DNS queries with the applicable value from the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the primary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the primary
     * resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the applicable value from
     * the secondary resource record set. This is true regardless of the health of the associated endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code> element and
     * set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see the following topics in the <i>Amazon
     * Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     */
    private String failover;
    /**
     * <p>
     * <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     * resources, such as web servers, create one multivalue answer record for each resource and specify
     * <code>true</code> for <code>MultiValueAnswer</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to DNS
     * queries with the corresponding IP address only when the health check is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers the
     * record to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer healthy
     * records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with different
     * combinations of healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a resource becomes unavailable after a resolver caches a response, client software typically tries another of
     * the IP addresses in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create multivalue answer alias records.
     * </p>
     */
    private Boolean multiValueAnswer;
    /**
     * <p>
     * The resource record cache time to live (TTL), in seconds. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you're creating or updating an alias resource record set, omit <code>TTL</code>. Amazon Route 53 uses the
     * value of <code>TTL</code> for the alias target.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're associating this resource record set with a health check (if you're adding a <code>HealthCheckId</code>
     * element), we recommend that you specify a <code>TTL</code> of 60 seconds or less so clients respond quickly to
     * changes in health status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the resource record sets in a group of weighted resource record sets must have the same value for
     * <code>TTL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a group of weighted resource record sets includes one or more weighted alias resource record sets for which
     * the alias target is an ELB load balancer, we recommend that you specify a <code>TTL</code> of 60 seconds for all
     * of the non-alias weighted resource record sets that have the same name and type. Values other than 60 seconds
     * (the TTL for load balancers) will change the effect of the values that you specify for <code>Weight</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Long tTL;
    /**
     * <p>
     * Information about the resource records to act upon.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceRecord> resourceRecords;
    /**
     * <p>
     * <i>Alias resource record sets only:</i> Information about the CloudFront distribution, AWS Elastic Beanstalk
     * environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set to which you're
     * redirecting queries. The AWS Elastic Beanstalk environment must have a regionalized subdomain.
     * </p>
     * <p>
     * If you're creating resource records sets for a private hosted zone, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create alias resource record sets for CloudFront distributions in a private hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is
     * unsupported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about creating failover resource record sets in a private hosted zone, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html"
     * >Configuring Failover in a Private Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private AliasTarget aliasTarget;
    /**
     * <p>
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a health
     * check is passing, include the <code>HealthCheckId</code> element and specify the ID of the applicable health
     * check.
     * </p>
     * <p>
     * Amazon Route 53 determines whether a resource record set is healthy based on one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By periodically sending a request to the endpoint that is specified in the health check
     * </p>
     * </li>
     * <li>
     * <p>
     * By aggregating the status of a specified group of health checks (calculated health checks)
     * </p>
     * </li>
     * <li>
     * <p>
     * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a>.
     * </p>
     * <p>
     * The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     * resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on the
     * status of a health check. Configuring health checks only makes sense in the following configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're checking the health of the resource record sets in a group of weighted, latency, geolocation, or failover
     * resource record sets, and you specify health check IDs for all of the resource record sets. If the health check
     * for one resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops responding to
     * queries using the value for that resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You set <code>EvaluateTargetHealth</code> to true for the resource record sets in a group of alias, weighted
     * alias, latency alias, geolocation alias, or failover alias resource record sets, and you specify health check IDs
     * for all of the resource record sets that are referenced by the alias resource record sets.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for example, the
     * endpoint specified by the IP address in the <code>Value</code> element. When you add a <code>HealthCheckId</code>
     * element to a resource record set, Amazon Route 53 checks the health of the endpoint that you specified in the
     * health check.
     * </p>
     * </important>
     * <p>
     * For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource record
     * set for the larger, associated geographic region. For example, suppose you have resource record sets for a state
     * in the United States, for the United States, for North America, and for all locations. If the endpoint for the
     * state resource record set is unhealthy, Amazon Route 53 checks the resource record sets for the United States,
     * for North America, and for all locations (a resource record set for which the value of <code>CountryCode</code>
     * is <code>*</code>), in that order, until it finds a resource record set for which the endpoint is healthy.
     * </p>
     * <p>
     * If your health checks specify the endpoint only by domain name, we recommend that you create a separate health
     * check for each endpoint. For example, create a health check for each <code>HTTP</code> server that is serving
     * content for <code>www.example.com</code>. For the value of <code>FullyQualifiedDomainName</code>, specify the
     * domain name of the server (such as <code>us-east-2-www.example.com</code>), not the name of the resource record
     * sets (example.com).
     * </p>
     * <important>
     * <p>
     * n this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and then associate the health check with those resource record sets,
     * health check results will be unpredictable.
     * </p>
     * </important>
     * <p>
     * For more information, see the following topics in the <i>Amazon Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     */
    private String healthCheckId;
    /**
     * <p>
     * When you create a traffic policy instance, Amazon Route 53 automatically creates a resource record set.
     * <code>TrafficPolicyInstanceId</code> is the ID of the traffic policy instance that Amazon Route 53 created this
     * resource record set for.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use
     * <code>DeleteTrafficPolicyInstance</code>. Amazon Route 53 will delete the resource record set automatically. If
     * you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Amazon Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to be charged for it even though it's no
     * longer in use.
     * </p>
     * </important>
     */
    private String trafficPolicyInstanceId;

    /**
     * Default constructor for ResourceRecordSet object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ResourceRecordSet() {
    }

    /**
     * Constructs a new ResourceRecordSet object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     *        The name of the domain you want to perform the action on.</p>
     *        <p>
     *        Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally include
     *        a trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name that you
     *        specify is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code> (without a
     *        trailing dot) and <code>www.example.com.</code> (with a trailing dot) as identical.
     *        </p>
     *        <p>
     *        For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *        <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     *        <code>*.example.com</code>. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     *        <code>prod*.example.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The * can't replace any of the middle labels, for example, marketing.*.example.com.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include * in any position other than the leftmost label in a domain name, DNS treats it as an *
     *        character (ASCII 42), not as a wildcard.
     *        </p>
     *        <important>
     *        <p>
     *        You can't use the * wildcard for resource records sets that have a type of NS.
     *        </p>
     *        </important></li>
     *        </ul>
     *        <p>
     *        You can use the * wildcard as the leftmost label in a domain name, for example, <code>*.example.com</code>
     *        . You can't use an * for one of the middle labels, for example, <code>marketing.*.example.com</code>. In
     *        addition, the * must replace the entire label; for example, you can't specify
     *        <code>prod*.example.com</code>.
     * @param type
     *        The DNS record type. For information about different record types and how data is encoded for them, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS
     *        Resource Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of
     *        weighted, latency, geolocation, or failover resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <p>
     *        Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> |
     *        <code>TXT</code>
     *        </p>
     *        <note>
     *        <p>
     *        SPF records were formerly used to verify the identity of the sender of email messages. However, we no
     *        longer recommend that you create resource record sets for which the value of <code>Type</code> is
     *        <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email,
     *        Version 1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CloudFront distributions:</b> <code>A</code>
     *        </p>
     *        <p>
     *        If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your
     *        distribution, one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 buckets:</b> <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that
     *        you're creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     *        </p>
     *        </li>
     */
    public ResourceRecordSet(String name, String type) {
        setName(name);
        setType(type);
    }

    /**
     * Constructs a new ResourceRecordSet object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     *        The name of the domain you want to perform the action on.</p>
     *        <p>
     *        Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally include
     *        a trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name that you
     *        specify is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code> (without a
     *        trailing dot) and <code>www.example.com.</code> (with a trailing dot) as identical.
     *        </p>
     *        <p>
     *        For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *        <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     *        <code>*.example.com</code>. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     *        <code>prod*.example.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The * can't replace any of the middle labels, for example, marketing.*.example.com.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include * in any position other than the leftmost label in a domain name, DNS treats it as an *
     *        character (ASCII 42), not as a wildcard.
     *        </p>
     *        <important>
     *        <p>
     *        You can't use the * wildcard for resource records sets that have a type of NS.
     *        </p>
     *        </important></li>
     *        </ul>
     *        <p>
     *        You can use the * wildcard as the leftmost label in a domain name, for example, <code>*.example.com</code>
     *        . You can't use an * for one of the middle labels, for example, <code>marketing.*.example.com</code>. In
     *        addition, the * must replace the entire label; for example, you can't specify
     *        <code>prod*.example.com</code>.
     * @param type
     *        The DNS record type. For information about different record types and how data is encoded for them, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS
     *        Resource Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of
     *        weighted, latency, geolocation, or failover resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <p>
     *        Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> |
     *        <code>TXT</code>
     *        </p>
     *        <note>
     *        <p>
     *        SPF records were formerly used to verify the identity of the sender of email messages. However, we no
     *        longer recommend that you create resource record sets for which the value of <code>Type</code> is
     *        <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email,
     *        Version 1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CloudFront distributions:</b> <code>A</code>
     *        </p>
     *        <p>
     *        If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your
     *        distribution, one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 buckets:</b> <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that
     *        you're creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     *        </p>
     *        </li>
     */
    public ResourceRecordSet(String name, RRType type) {
        setName(name);
        setType(type.toString());
    }

    /**
     * <p>
     * The name of the domain you want to perform the action on.
     * </p>
     * <p>
     * Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally include a
     * trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name that you specify
     * is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code> (without a trailing dot)
     * and <code>www.example.com.</code> (with a trailing dot) as identical.
     * </p>
     * <p>
     * For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     * (hyphen) and how to specify internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     * <code>*.example.com</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     * <code>prod*.example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The * can't replace any of the middle labels, for example, marketing.*.example.com.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include * in any position other than the leftmost label in a domain name, DNS treats it as an * character
     * (ASCII 42), not as a wildcard.
     * </p>
     * <important>
     * <p>
     * You can't use the * wildcard for resource records sets that have a type of NS.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You can use the * wildcard as the leftmost label in a domain name, for example, <code>*.example.com</code>. You
     * can't use an * for one of the middle labels, for example, <code>marketing.*.example.com</code>. In addition, the
     * * must replace the entire label; for example, you can't specify <code>prod*.example.com</code>.
     * </p>
     * 
     * @param name
     *        The name of the domain you want to perform the action on.</p>
     *        <p>
     *        Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally include
     *        a trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name that you
     *        specify is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code> (without a
     *        trailing dot) and <code>www.example.com.</code> (with a trailing dot) as identical.
     *        </p>
     *        <p>
     *        For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *        <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     *        <code>*.example.com</code>. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     *        <code>prod*.example.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The * can't replace any of the middle labels, for example, marketing.*.example.com.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include * in any position other than the leftmost label in a domain name, DNS treats it as an *
     *        character (ASCII 42), not as a wildcard.
     *        </p>
     *        <important>
     *        <p>
     *        You can't use the * wildcard for resource records sets that have a type of NS.
     *        </p>
     *        </important></li>
     *        </ul>
     *        <p>
     *        You can use the * wildcard as the leftmost label in a domain name, for example, <code>*.example.com</code>
     *        . You can't use an * for one of the middle labels, for example, <code>marketing.*.example.com</code>. In
     *        addition, the * must replace the entire label; for example, you can't specify
     *        <code>prod*.example.com</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain you want to perform the action on.
     * </p>
     * <p>
     * Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally include a
     * trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name that you specify
     * is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code> (without a trailing dot)
     * and <code>www.example.com.</code> (with a trailing dot) as identical.
     * </p>
     * <p>
     * For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     * (hyphen) and how to specify internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     * <code>*.example.com</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     * <code>prod*.example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The * can't replace any of the middle labels, for example, marketing.*.example.com.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include * in any position other than the leftmost label in a domain name, DNS treats it as an * character
     * (ASCII 42), not as a wildcard.
     * </p>
     * <important>
     * <p>
     * You can't use the * wildcard for resource records sets that have a type of NS.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You can use the * wildcard as the leftmost label in a domain name, for example, <code>*.example.com</code>. You
     * can't use an * for one of the middle labels, for example, <code>marketing.*.example.com</code>. In addition, the
     * * must replace the entire label; for example, you can't specify <code>prod*.example.com</code>.
     * </p>
     * 
     * @return The name of the domain you want to perform the action on.</p>
     *         <p>
     *         Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally
     *         include a trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name
     *         that you specify is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code>
     *         (without a trailing dot) and <code>www.example.com.</code> (with a trailing dot) as identical.
     *         </p>
     *         <p>
     *         For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *         <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *         Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     *         <code>*.example.com</code>. Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     *         <code>prod*.example.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The * can't replace any of the middle labels, for example, marketing.*.example.com.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you include * in any position other than the leftmost label in a domain name, DNS treats it as an *
     *         character (ASCII 42), not as a wildcard.
     *         </p>
     *         <important>
     *         <p>
     *         You can't use the * wildcard for resource records sets that have a type of NS.
     *         </p>
     *         </important></li>
     *         </ul>
     *         <p>
     *         You can use the * wildcard as the leftmost label in a domain name, for example,
     *         <code>*.example.com</code>. You can't use an * for one of the middle labels, for example,
     *         <code>marketing.*.example.com</code>. In addition, the * must replace the entire label; for example, you
     *         can't specify <code>prod*.example.com</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain you want to perform the action on.
     * </p>
     * <p>
     * Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally include a
     * trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name that you specify
     * is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code> (without a trailing dot)
     * and <code>www.example.com.</code> (with a trailing dot) as identical.
     * </p>
     * <p>
     * For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     * (hyphen) and how to specify internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     * <code>*.example.com</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     * <code>prod*.example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The * can't replace any of the middle labels, for example, marketing.*.example.com.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include * in any position other than the leftmost label in a domain name, DNS treats it as an * character
     * (ASCII 42), not as a wildcard.
     * </p>
     * <important>
     * <p>
     * You can't use the * wildcard for resource records sets that have a type of NS.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You can use the * wildcard as the leftmost label in a domain name, for example, <code>*.example.com</code>. You
     * can't use an * for one of the middle labels, for example, <code>marketing.*.example.com</code>. In addition, the
     * * must replace the entire label; for example, you can't specify <code>prod*.example.com</code>.
     * </p>
     * 
     * @param name
     *        The name of the domain you want to perform the action on.</p>
     *        <p>
     *        Enter a fully qualified domain name, for example, <code>www.example.com</code>. You can optionally include
     *        a trailing dot. If you omit the trailing dot, Amazon Route 53 still assumes that the domain name that you
     *        specify is fully qualified. This means that Amazon Route 53 treats <code>www.example.com</code> (without a
     *        trailing dot) and <code>www.example.com.</code> (with a trailing dot) as identical.
     *        </p>
     *        <p>
     *        For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *        <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example,
     *        <code>*.example.com</code>. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The * must replace the entire label. For example, you can't specify <code>*prod.example.com</code> or
     *        <code>prod*.example.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The * can't replace any of the middle labels, for example, marketing.*.example.com.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include * in any position other than the leftmost label in a domain name, DNS treats it as an *
     *        character (ASCII 42), not as a wildcard.
     *        </p>
     *        <important>
     *        <p>
     *        You can't use the * wildcard for resource records sets that have a type of NS.
     *        </p>
     *        </important></li>
     *        </ul>
     *        <p>
     *        You can use the * wildcard as the leftmost label in a domain name, for example, <code>*.example.com</code>
     *        . You can't use an * for one of the middle labels, for example, <code>marketing.*.example.com</code>. In
     *        addition, the * must replace the entire label; for example, you can't specify
     *        <code>prod*.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how data is encoded for them, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS Resource
     * Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of weighted, latency, geolocation,
     * or failover resource record sets, specify the same value for all of the resource record sets in the group.
     * </p>
     * <p>
     * Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> | <code>MX</code> |
     * <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <note>
     * <p>
     * SPF records were formerly used to verify the identity of the sender of email messages. However, we no longer
     * recommend that you create resource record sets for which the value of <code>Type</code> is <code>SPF</code>. RFC
     * 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email, Version 1</i>, has been updated
     * to say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.
     * </p>
     * </note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CloudFront distributions:</b> <code>A</code>
     * </p>
     * <p>
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your distribution,
     * one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 buckets:</b> <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that you're
     * creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The DNS record type. For information about different record types and how data is encoded for them, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS
     *        Resource Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of
     *        weighted, latency, geolocation, or failover resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <p>
     *        Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> |
     *        <code>TXT</code>
     *        </p>
     *        <note>
     *        <p>
     *        SPF records were formerly used to verify the identity of the sender of email messages. However, we no
     *        longer recommend that you create resource record sets for which the value of <code>Type</code> is
     *        <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email,
     *        Version 1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CloudFront distributions:</b> <code>A</code>
     *        </p>
     *        <p>
     *        If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your
     *        distribution, one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 buckets:</b> <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that
     *        you're creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     *        </p>
     *        </li>
     * @see RRType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how data is encoded for them, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS Resource
     * Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of weighted, latency, geolocation,
     * or failover resource record sets, specify the same value for all of the resource record sets in the group.
     * </p>
     * <p>
     * Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> | <code>MX</code> |
     * <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <note>
     * <p>
     * SPF records were formerly used to verify the identity of the sender of email messages. However, we no longer
     * recommend that you create resource record sets for which the value of <code>Type</code> is <code>SPF</code>. RFC
     * 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email, Version 1</i>, has been updated
     * to say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.
     * </p>
     * </note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CloudFront distributions:</b> <code>A</code>
     * </p>
     * <p>
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your distribution,
     * one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 buckets:</b> <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that you're
     * creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DNS record type. For information about different record types and how data is encoded for them, see
     *         <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS
     *         Resource Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *         <p>
     *         Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *         <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *         <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *         <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of
     *         weighted, latency, geolocation, or failover resource record sets, specify the same value for all of the
     *         resource record sets in the group.
     *         </p>
     *         <p>
     *         Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> |
     *         <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> |
     *         <code>TXT</code>
     *         </p>
     *         <note>
     *         <p>
     *         SPF records were formerly used to verify the identity of the sender of email messages. However, we no
     *         longer recommend that you create resource record sets for which the value of <code>Type</code> is
     *         <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email,
     *         Version 1</i>, has been updated to say,
     *         "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *         In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *         Record Type</a>.
     *         </p>
     *         </note>
     *         <p>
     *         Values for alias resource record sets:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>CloudFront distributions:</b> <code>A</code>
     *         </p>
     *         <p>
     *         If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your
     *         distribution, one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon S3 buckets:</b> <code>A</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that
     *         you're creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     *         </p>
     *         </li>
     * @see RRType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how data is encoded for them, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS Resource
     * Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of weighted, latency, geolocation,
     * or failover resource record sets, specify the same value for all of the resource record sets in the group.
     * </p>
     * <p>
     * Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> | <code>MX</code> |
     * <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <note>
     * <p>
     * SPF records were formerly used to verify the identity of the sender of email messages. However, we no longer
     * recommend that you create resource record sets for which the value of <code>Type</code> is <code>SPF</code>. RFC
     * 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email, Version 1</i>, has been updated
     * to say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.
     * </p>
     * </note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CloudFront distributions:</b> <code>A</code>
     * </p>
     * <p>
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your distribution,
     * one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 buckets:</b> <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that you're
     * creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The DNS record type. For information about different record types and how data is encoded for them, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS
     *        Resource Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of
     *        weighted, latency, geolocation, or failover resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <p>
     *        Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> |
     *        <code>TXT</code>
     *        </p>
     *        <note>
     *        <p>
     *        SPF records were formerly used to verify the identity of the sender of email messages. However, we no
     *        longer recommend that you create resource record sets for which the value of <code>Type</code> is
     *        <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email,
     *        Version 1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CloudFront distributions:</b> <code>A</code>
     *        </p>
     *        <p>
     *        If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your
     *        distribution, one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 buckets:</b> <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that
     *        you're creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public ResourceRecordSet withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how data is encoded for them, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS Resource
     * Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of weighted, latency, geolocation,
     * or failover resource record sets, specify the same value for all of the resource record sets in the group.
     * </p>
     * <p>
     * Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> | <code>MX</code> |
     * <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <note>
     * <p>
     * SPF records were formerly used to verify the identity of the sender of email messages. However, we no longer
     * recommend that you create resource record sets for which the value of <code>Type</code> is <code>SPF</code>. RFC
     * 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email, Version 1</i>, has been updated
     * to say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.
     * </p>
     * </note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CloudFront distributions:</b> <code>A</code>
     * </p>
     * <p>
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your distribution,
     * one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 buckets:</b> <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that you're
     * creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The DNS record type. For information about different record types and how data is encoded for them, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS
     *        Resource Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of
     *        weighted, latency, geolocation, or failover resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <p>
     *        Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> |
     *        <code>TXT</code>
     *        </p>
     *        <note>
     *        <p>
     *        SPF records were formerly used to verify the identity of the sender of email messages. However, we no
     *        longer recommend that you create resource record sets for which the value of <code>Type</code> is
     *        <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email,
     *        Version 1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CloudFront distributions:</b> <code>A</code>
     *        </p>
     *        <p>
     *        If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your
     *        distribution, one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 buckets:</b> <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that
     *        you're creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     *        </p>
     *        </li>
     * @see RRType
     */

    public void setType(RRType type) {
        withType(type);
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how data is encoded for them, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS Resource
     * Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of weighted, latency, geolocation,
     * or failover resource record sets, specify the same value for all of the resource record sets in the group.
     * </p>
     * <p>
     * Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> | <code>MX</code> |
     * <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <note>
     * <p>
     * SPF records were formerly used to verify the identity of the sender of email messages. However, we no longer
     * recommend that you create resource record sets for which the value of <code>Type</code> is <code>SPF</code>. RFC
     * 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email, Version 1</i>, has been updated
     * to say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.
     * </p>
     * </note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CloudFront distributions:</b> <code>A</code>
     * </p>
     * <p>
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your distribution,
     * one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 buckets:</b> <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that you're
     * creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The DNS record type. For information about different record types and how data is encoded for them, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html">Supported DNS
     *        Resource Record Types</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When creating a group of
     *        weighted, latency, geolocation, or failover resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <p>
     *        Valid values for multivalue answer resource record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code> |
     *        <code>TXT</code>
     *        </p>
     *        <note>
     *        <p>
     *        SPF records were formerly used to verify the identity of the sender of email messages. However, we no
     *        longer recommend that you create resource record sets for which the value of <code>Type</code> is
     *        <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for Authorizing Use of Domains in Email,
     *        Version 1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CloudFront distributions:</b> <code>A</code>
     *        </p>
     *        <p>
     *        If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your
     *        distribution, one with a value of <code>A</code> and one with a value of <code>AAAA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Elastic Beanstalk environment that has a regionalized subdomain</b>: <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 buckets:</b> <code>A</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> Specify the type of the resource record set that
     *        you're creating the alias for. All values are supported except <code>NS</code> and <code>SOA</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public ResourceRecordSet withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An identifier that differentiates among
     * multiple resource record sets that have the same combination of DNS name and type. The value of
     * <code>SetIdentifier</code> must be unique for each resource record set that has the same combination of DNS name
     * and type. Omit <code>SetIdentifier</code> for any other types of record sets.
     * </p>
     * 
     * @param setIdentifier
     *        <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An identifier that differentiates
     *        among multiple resource record sets that have the same combination of DNS name and type. The value of
     *        <code>SetIdentifier</code> must be unique for each resource record set that has the same combination of
     *        DNS name and type. Omit <code>SetIdentifier</code> for any other types of record sets.
     */

    public void setSetIdentifier(String setIdentifier) {
        this.setIdentifier = setIdentifier;
    }

    /**
     * <p>
     * <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An identifier that differentiates among
     * multiple resource record sets that have the same combination of DNS name and type. The value of
     * <code>SetIdentifier</code> must be unique for each resource record set that has the same combination of DNS name
     * and type. Omit <code>SetIdentifier</code> for any other types of record sets.
     * </p>
     * 
     * @return <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An identifier that differentiates
     *         among multiple resource record sets that have the same combination of DNS name and type. The value of
     *         <code>SetIdentifier</code> must be unique for each resource record set that has the same combination of
     *         DNS name and type. Omit <code>SetIdentifier</code> for any other types of record sets.
     */

    public String getSetIdentifier() {
        return this.setIdentifier;
    }

    /**
     * <p>
     * <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An identifier that differentiates among
     * multiple resource record sets that have the same combination of DNS name and type. The value of
     * <code>SetIdentifier</code> must be unique for each resource record set that has the same combination of DNS name
     * and type. Omit <code>SetIdentifier</code> for any other types of record sets.
     * </p>
     * 
     * @param setIdentifier
     *        <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An identifier that differentiates
     *        among multiple resource record sets that have the same combination of DNS name and type. The value of
     *        <code>SetIdentifier</code> must be unique for each resource record set that has the same combination of
     *        DNS name and type. Omit <code>SetIdentifier</code> for any other types of record sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withSetIdentifier(String setIdentifier) {
        setSetIdentifier(setIdentifier);
        return this;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> Among resource record sets that have the same combination of DNS name
     * and type, a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the
     * current resource record set. Amazon Route 53 calculates the sum of the weights for the resource record sets that
     * have the same combination of DNS name and type. Amazon Route 53 then responds to queries based on the ratio of a
     * resource's weight to the total. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must specify a value for the <code>Weight</code> element for every weighted resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per weighted resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create latency, failover, or geolocation resource record sets that have the same values for the
     * <code>Name</code> and <code>Type</code> elements as weighted resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a maximum of 100 weighted resource record sets that have the same values for the <code>Name</code>
     * and <code>Type</code> elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * For weighted (but not weighted alias) resource record sets, if you set <code>Weight</code> to <code>0</code> for
     * a resource record set, Amazon Route 53 never responds to queries with the applicable value for that resource
     * record set. However, if you set <code>Weight</code> to <code>0</code> for all resource record sets that have the
     * same combination of DNS name and type, traffic is routed to all resources with equal probability.
     * </p>
     * <p>
     * The effect of setting <code>Weight</code> to <code>0</code> is different when you associate health checks with
     * weighted resource record sets. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html">Options for
     * Configuring Amazon Route 53 Active-Active and Active-Passive Failover</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param weight
     *        <i>Weighted resource record sets only:</i> Among resource record sets that have the same combination of
     *        DNS name and type, a value that determines the proportion of DNS queries that Amazon Route 53 responds to
     *        using the current resource record set. Amazon Route 53 calculates the sum of the weights for the resource
     *        record sets that have the same combination of DNS name and type. Amazon Route 53 then responds to queries
     *        based on the ratio of a resource's weight to the total. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You must specify a value for the <code>Weight</code> element for every weighted resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only specify one <code>ResourceRecord</code> per weighted resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't create latency, failover, or geolocation resource record sets that have the same values for the
     *        <code>Name</code> and <code>Type</code> elements as weighted resource record sets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can create a maximum of 100 weighted resource record sets that have the same values for the
     *        <code>Name</code> and <code>Type</code> elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For weighted (but not weighted alias) resource record sets, if you set <code>Weight</code> to
     *        <code>0</code> for a resource record set, Amazon Route 53 never responds to queries with the applicable
     *        value for that resource record set. However, if you set <code>Weight</code> to <code>0</code> for all
     *        resource record sets that have the same combination of DNS name and type, traffic is routed to all
     *        resources with equal probability.
     *        </p>
     *        <p>
     *        The effect of setting <code>Weight</code> to <code>0</code> is different when you associate health checks
     *        with weighted resource record sets. For more information, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     *        >Options for Configuring Amazon Route 53 Active-Active and Active-Passive Failover</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.
     *        </p>
     *        </li>
     */

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> Among resource record sets that have the same combination of DNS name
     * and type, a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the
     * current resource record set. Amazon Route 53 calculates the sum of the weights for the resource record sets that
     * have the same combination of DNS name and type. Amazon Route 53 then responds to queries based on the ratio of a
     * resource's weight to the total. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must specify a value for the <code>Weight</code> element for every weighted resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per weighted resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create latency, failover, or geolocation resource record sets that have the same values for the
     * <code>Name</code> and <code>Type</code> elements as weighted resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a maximum of 100 weighted resource record sets that have the same values for the <code>Name</code>
     * and <code>Type</code> elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * For weighted (but not weighted alias) resource record sets, if you set <code>Weight</code> to <code>0</code> for
     * a resource record set, Amazon Route 53 never responds to queries with the applicable value for that resource
     * record set. However, if you set <code>Weight</code> to <code>0</code> for all resource record sets that have the
     * same combination of DNS name and type, traffic is routed to all resources with equal probability.
     * </p>
     * <p>
     * The effect of setting <code>Weight</code> to <code>0</code> is different when you associate health checks with
     * weighted resource record sets. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html">Options for
     * Configuring Amazon Route 53 Active-Active and Active-Passive Failover</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <i>Weighted resource record sets only:</i> Among resource record sets that have the same combination of
     *         DNS name and type, a value that determines the proportion of DNS queries that Amazon Route 53 responds to
     *         using the current resource record set. Amazon Route 53 calculates the sum of the weights for the resource
     *         record sets that have the same combination of DNS name and type. Amazon Route 53 then responds to queries
     *         based on the ratio of a resource's weight to the total. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You must specify a value for the <code>Weight</code> element for every weighted resource record set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can only specify one <code>ResourceRecord</code> per weighted resource record set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't create latency, failover, or geolocation resource record sets that have the same values for the
     *         <code>Name</code> and <code>Type</code> elements as weighted resource record sets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can create a maximum of 100 weighted resource record sets that have the same values for the
     *         <code>Name</code> and <code>Type</code> elements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For weighted (but not weighted alias) resource record sets, if you set <code>Weight</code> to
     *         <code>0</code> for a resource record set, Amazon Route 53 never responds to queries with the applicable
     *         value for that resource record set. However, if you set <code>Weight</code> to <code>0</code> for all
     *         resource record sets that have the same combination of DNS name and type, traffic is routed to all
     *         resources with equal probability.
     *         </p>
     *         <p>
     *         The effect of setting <code>Weight</code> to <code>0</code> is different when you associate health checks
     *         with weighted resource record sets. For more information, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     *         >Options for Configuring Amazon Route 53 Active-Active and Active-Passive Failover</a> in the <i>Amazon
     *         Route 53 Developer Guide</i>.
     *         </p>
     *         </li>
     */

    public Long getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> Among resource record sets that have the same combination of DNS name
     * and type, a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the
     * current resource record set. Amazon Route 53 calculates the sum of the weights for the resource record sets that
     * have the same combination of DNS name and type. Amazon Route 53 then responds to queries based on the ratio of a
     * resource's weight to the total. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must specify a value for the <code>Weight</code> element for every weighted resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per weighted resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create latency, failover, or geolocation resource record sets that have the same values for the
     * <code>Name</code> and <code>Type</code> elements as weighted resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a maximum of 100 weighted resource record sets that have the same values for the <code>Name</code>
     * and <code>Type</code> elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * For weighted (but not weighted alias) resource record sets, if you set <code>Weight</code> to <code>0</code> for
     * a resource record set, Amazon Route 53 never responds to queries with the applicable value for that resource
     * record set. However, if you set <code>Weight</code> to <code>0</code> for all resource record sets that have the
     * same combination of DNS name and type, traffic is routed to all resources with equal probability.
     * </p>
     * <p>
     * The effect of setting <code>Weight</code> to <code>0</code> is different when you associate health checks with
     * weighted resource record sets. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html">Options for
     * Configuring Amazon Route 53 Active-Active and Active-Passive Failover</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param weight
     *        <i>Weighted resource record sets only:</i> Among resource record sets that have the same combination of
     *        DNS name and type, a value that determines the proportion of DNS queries that Amazon Route 53 responds to
     *        using the current resource record set. Amazon Route 53 calculates the sum of the weights for the resource
     *        record sets that have the same combination of DNS name and type. Amazon Route 53 then responds to queries
     *        based on the ratio of a resource's weight to the total. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You must specify a value for the <code>Weight</code> element for every weighted resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only specify one <code>ResourceRecord</code> per weighted resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't create latency, failover, or geolocation resource record sets that have the same values for the
     *        <code>Name</code> and <code>Type</code> elements as weighted resource record sets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can create a maximum of 100 weighted resource record sets that have the same values for the
     *        <code>Name</code> and <code>Type</code> elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For weighted (but not weighted alias) resource record sets, if you set <code>Weight</code> to
     *        <code>0</code> for a resource record set, Amazon Route 53 never responds to queries with the applicable
     *        value for that resource record set. However, if you set <code>Weight</code> to <code>0</code> for all
     *        resource record sets that have the same combination of DNS name and type, traffic is routed to all
     *        resources with equal probability.
     *        </p>
     *        <p>
     *        The effect of setting <code>Weight</code> to <code>0</code> is different when you associate health checks
     *        with weighted resource record sets. For more information, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     *        >Options for Configuring Amazon Route 53 Active-Active and Active-Passive Failover</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withWeight(Long weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that this
     * resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or an ELB load
     * balancer, and is referred to by an IP address or a DNS domain name, depending on the record type.
     * </p>
     * <note>
     * <p>
     * Creating latency and latency alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency resource
     * record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is associated with the
     * selected resource record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per latency resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only create one latency resource record set for each Amazon EC2 Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53 will
     * choose the region with the best latency from among the regions that you create latency resource record sets for.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as latency resource record sets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param region
     *        <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that
     *        this resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or
     *        an ELB load balancer, and is referred to by an IP address or a DNS domain name, depending on the record
     *        type.</p> <note>
     *        <p>
     *        Creating latency and latency alias resource record sets in private hosted zones is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency
     *        resource record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency
     *        between the end user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is
     *        associated with the selected resource record set.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can only specify one <code>ResourceRecord</code> per latency resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only create one latency resource record set for each Amazon EC2 Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53
     *        will choose the region with the best latency from among the regions that you create latency resource
     *        record sets for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements as latency resource record sets.
     *        </p>
     *        </li>
     * @see ResourceRecordSetRegion
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that this
     * resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or an ELB load
     * balancer, and is referred to by an IP address or a DNS domain name, depending on the record type.
     * </p>
     * <note>
     * <p>
     * Creating latency and latency alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency resource
     * record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is associated with the
     * selected resource record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per latency resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only create one latency resource record set for each Amazon EC2 Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53 will
     * choose the region with the best latency from among the regions that you create latency resource record sets for.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as latency resource record sets.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that
     *         this resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or
     *         an ELB load balancer, and is referred to by an IP address or a DNS domain name, depending on the record
     *         type.</p> <note>
     *         <p>
     *         Creating latency and latency alias resource record sets in private hosted zones is not supported.
     *         </p>
     *         </note>
     *         <p>
     *         When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency
     *         resource record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency
     *         between the end user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is
     *         associated with the selected resource record set.
     *         </p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can only specify one <code>ResourceRecord</code> per latency resource record set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can only create one latency resource record set for each Amazon EC2 Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53
     *         will choose the region with the best latency from among the regions that you create latency resource
     *         record sets for.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     *         <code>Type</code> elements as latency resource record sets.
     *         </p>
     *         </li>
     * @see ResourceRecordSetRegion
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that this
     * resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or an ELB load
     * balancer, and is referred to by an IP address or a DNS domain name, depending on the record type.
     * </p>
     * <note>
     * <p>
     * Creating latency and latency alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency resource
     * record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is associated with the
     * selected resource record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per latency resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only create one latency resource record set for each Amazon EC2 Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53 will
     * choose the region with the best latency from among the regions that you create latency resource record sets for.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as latency resource record sets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param region
     *        <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that
     *        this resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or
     *        an ELB load balancer, and is referred to by an IP address or a DNS domain name, depending on the record
     *        type.</p> <note>
     *        <p>
     *        Creating latency and latency alias resource record sets in private hosted zones is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency
     *        resource record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency
     *        between the end user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is
     *        associated with the selected resource record set.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can only specify one <code>ResourceRecord</code> per latency resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only create one latency resource record set for each Amazon EC2 Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53
     *        will choose the region with the best latency from among the regions that you create latency resource
     *        record sets for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements as latency resource record sets.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRecordSetRegion
     */

    public ResourceRecordSet withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that this
     * resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or an ELB load
     * balancer, and is referred to by an IP address or a DNS domain name, depending on the record type.
     * </p>
     * <note>
     * <p>
     * Creating latency and latency alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency resource
     * record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is associated with the
     * selected resource record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per latency resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only create one latency resource record set for each Amazon EC2 Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53 will
     * choose the region with the best latency from among the regions that you create latency resource record sets for.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as latency resource record sets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param region
     *        <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that
     *        this resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or
     *        an ELB load balancer, and is referred to by an IP address or a DNS domain name, depending on the record
     *        type.</p> <note>
     *        <p>
     *        Creating latency and latency alias resource record sets in private hosted zones is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency
     *        resource record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency
     *        between the end user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is
     *        associated with the selected resource record set.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can only specify one <code>ResourceRecord</code> per latency resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only create one latency resource record set for each Amazon EC2 Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53
     *        will choose the region with the best latency from among the regions that you create latency resource
     *        record sets for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements as latency resource record sets.
     *        </p>
     *        </li>
     * @see ResourceRecordSetRegion
     */

    public void setRegion(ResourceRecordSetRegion region) {
        withRegion(region);
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that this
     * resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or an ELB load
     * balancer, and is referred to by an IP address or a DNS domain name, depending on the record type.
     * </p>
     * <note>
     * <p>
     * Creating latency and latency alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency resource
     * record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is associated with the
     * selected resource record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only specify one <code>ResourceRecord</code> per latency resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only create one latency resource record set for each Amazon EC2 Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53 will
     * choose the region with the best latency from among the regions that you create latency resource record sets for.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as latency resource record sets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param region
     *        <i>Latency-based resource record sets only:</i> The Amazon EC2 Region where you created the resource that
     *        this resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or
     *        an ELB load balancer, and is referred to by an IP address or a DNS domain name, depending on the record
     *        type.</p> <note>
     *        <p>
     *        Creating latency and latency alias resource record sets in private hosted zones is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency
     *        resource record sets, Amazon Route 53 selects the latency resource record set that has the lowest latency
     *        between the end user and the associated Amazon EC2 Region. Amazon Route 53 then returns the value that is
     *        associated with the selected resource record set.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can only specify one <code>ResourceRecord</code> per latency resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only create one latency resource record set for each Amazon EC2 Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You aren't required to create latency resource record sets for all Amazon EC2 Regions. Amazon Route 53
     *        will choose the region with the best latency from among the regions that you create latency resource
     *        record sets for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't create non-latency resource record sets that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements as latency resource record sets.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRecordSetRegion
     */

    public ResourceRecordSet withRegion(ResourceRecordSetRegion region) {
        this.region = region.toString();
        return this;
    }

    /**
     * <p>
     * <i>Geo location resource record sets only:</i> A complex type that lets you control how Amazon Route 53 responds
     * to DNS queries based on the geographic origin of the query. For example, if you want all queries from Africa to
     * be routed to a web server with an IP address of <code>192.0.2.111</code>, create a resource record set with a
     * <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of <code>AF</code>.
     * </p>
     * <note>
     * <p>
     * Creating geolocation and geolocation alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * If you create separate resource record sets for overlapping geographic regions (for example, one resource record
     * set for a continent and one for a country on the same continent), priority goes to the smallest geographic
     * region. This allows you to route most queries for a continent to one resource and to route queries for a country
     * on that continent to a different resource.
     * </p>
     * <p>
     * You can't create two geolocation resource record sets that specify the same geographic location.
     * </p>
     * <p>
     * The value <code>*</code> in the <code>CountryCode</code> element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements.
     * </p>
     * <important>
     * <p>
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't mapped to geographic
     * locations, so even if you create geolocation resource record sets that cover all seven continents, Amazon Route
     * 53 will receive some DNS queries from locations that it can't identify. We recommend that you create a resource
     * record set for which the value of <code>CountryCode</code> is <code>*</code>, which handles both queries that
     * come from locations for which you haven't created geolocation resource record sets and queries from IP addresses
     * that aren't mapped to a location. If you don't create a <code>*</code> resource record set, Amazon Route 53
     * returns a "no answer" response for queries from those locations.
     * </p>
     * </important>
     * <p>
     * You can't create non-geolocation resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as geolocation resource record sets.
     * </p>
     * 
     * @param geoLocation
     *        <i>Geo location resource record sets only:</i> A complex type that lets you control how Amazon Route 53
     *        responds to DNS queries based on the geographic origin of the query. For example, if you want all queries
     *        from Africa to be routed to a web server with an IP address of <code>192.0.2.111</code>, create a resource
     *        record set with a <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of <code>AF</code>
     *        .</p> <note>
     *        <p>
     *        Creating geolocation and geolocation alias resource record sets in private hosted zones is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        If you create separate resource record sets for overlapping geographic regions (for example, one resource
     *        record set for a continent and one for a country on the same continent), priority goes to the smallest
     *        geographic region. This allows you to route most queries for a continent to one resource and to route
     *        queries for a country on that continent to a different resource.
     *        </p>
     *        <p>
     *        You can't create two geolocation resource record sets that specify the same geographic location.
     *        </p>
     *        <p>
     *        The value <code>*</code> in the <code>CountryCode</code> element matches all geographic locations that
     *        aren't specified in other geolocation resource record sets that have the same values for the
     *        <code>Name</code> and <code>Type</code> elements.
     *        </p>
     *        <important>
     *        <p>
     *        Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't mapped to
     *        geographic locations, so even if you create geolocation resource record sets that cover all seven
     *        continents, Amazon Route 53 will receive some DNS queries from locations that it can't identify. We
     *        recommend that you create a resource record set for which the value of <code>CountryCode</code> is
     *        <code>*</code>, which handles both queries that come from locations for which you haven't created
     *        geolocation resource record sets and queries from IP addresses that aren't mapped to a location. If you
     *        don't create a <code>*</code> resource record set, Amazon Route 53 returns a "no answer" response for
     *        queries from those locations.
     *        </p>
     *        </important>
     *        <p>
     *        You can't create non-geolocation resource record sets that have the same values for the <code>Name</code>
     *        and <code>Type</code> elements as geolocation resource record sets.
     */

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    /**
     * <p>
     * <i>Geo location resource record sets only:</i> A complex type that lets you control how Amazon Route 53 responds
     * to DNS queries based on the geographic origin of the query. For example, if you want all queries from Africa to
     * be routed to a web server with an IP address of <code>192.0.2.111</code>, create a resource record set with a
     * <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of <code>AF</code>.
     * </p>
     * <note>
     * <p>
     * Creating geolocation and geolocation alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * If you create separate resource record sets for overlapping geographic regions (for example, one resource record
     * set for a continent and one for a country on the same continent), priority goes to the smallest geographic
     * region. This allows you to route most queries for a continent to one resource and to route queries for a country
     * on that continent to a different resource.
     * </p>
     * <p>
     * You can't create two geolocation resource record sets that specify the same geographic location.
     * </p>
     * <p>
     * The value <code>*</code> in the <code>CountryCode</code> element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements.
     * </p>
     * <important>
     * <p>
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't mapped to geographic
     * locations, so even if you create geolocation resource record sets that cover all seven continents, Amazon Route
     * 53 will receive some DNS queries from locations that it can't identify. We recommend that you create a resource
     * record set for which the value of <code>CountryCode</code> is <code>*</code>, which handles both queries that
     * come from locations for which you haven't created geolocation resource record sets and queries from IP addresses
     * that aren't mapped to a location. If you don't create a <code>*</code> resource record set, Amazon Route 53
     * returns a "no answer" response for queries from those locations.
     * </p>
     * </important>
     * <p>
     * You can't create non-geolocation resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as geolocation resource record sets.
     * </p>
     * 
     * @return <i>Geo location resource record sets only:</i> A complex type that lets you control how Amazon Route 53
     *         responds to DNS queries based on the geographic origin of the query. For example, if you want all queries
     *         from Africa to be routed to a web server with an IP address of <code>192.0.2.111</code>, create a
     *         resource record set with a <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of
     *         <code>AF</code>.</p> <note>
     *         <p>
     *         Creating geolocation and geolocation alias resource record sets in private hosted zones is not supported.
     *         </p>
     *         </note>
     *         <p>
     *         If you create separate resource record sets for overlapping geographic regions (for example, one resource
     *         record set for a continent and one for a country on the same continent), priority goes to the smallest
     *         geographic region. This allows you to route most queries for a continent to one resource and to route
     *         queries for a country on that continent to a different resource.
     *         </p>
     *         <p>
     *         You can't create two geolocation resource record sets that specify the same geographic location.
     *         </p>
     *         <p>
     *         The value <code>*</code> in the <code>CountryCode</code> element matches all geographic locations that
     *         aren't specified in other geolocation resource record sets that have the same values for the
     *         <code>Name</code> and <code>Type</code> elements.
     *         </p>
     *         <important>
     *         <p>
     *         Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't mapped to
     *         geographic locations, so even if you create geolocation resource record sets that cover all seven
     *         continents, Amazon Route 53 will receive some DNS queries from locations that it can't identify. We
     *         recommend that you create a resource record set for which the value of <code>CountryCode</code> is
     *         <code>*</code>, which handles both queries that come from locations for which you haven't created
     *         geolocation resource record sets and queries from IP addresses that aren't mapped to a location. If you
     *         don't create a <code>*</code> resource record set, Amazon Route 53 returns a "no answer" response for
     *         queries from those locations.
     *         </p>
     *         </important>
     *         <p>
     *         You can't create non-geolocation resource record sets that have the same values for the <code>Name</code>
     *         and <code>Type</code> elements as geolocation resource record sets.
     */

    public GeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    /**
     * <p>
     * <i>Geo location resource record sets only:</i> A complex type that lets you control how Amazon Route 53 responds
     * to DNS queries based on the geographic origin of the query. For example, if you want all queries from Africa to
     * be routed to a web server with an IP address of <code>192.0.2.111</code>, create a resource record set with a
     * <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of <code>AF</code>.
     * </p>
     * <note>
     * <p>
     * Creating geolocation and geolocation alias resource record sets in private hosted zones is not supported.
     * </p>
     * </note>
     * <p>
     * If you create separate resource record sets for overlapping geographic regions (for example, one resource record
     * set for a continent and one for a country on the same continent), priority goes to the smallest geographic
     * region. This allows you to route most queries for a continent to one resource and to route queries for a country
     * on that continent to a different resource.
     * </p>
     * <p>
     * You can't create two geolocation resource record sets that specify the same geographic location.
     * </p>
     * <p>
     * The value <code>*</code> in the <code>CountryCode</code> element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements.
     * </p>
     * <important>
     * <p>
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't mapped to geographic
     * locations, so even if you create geolocation resource record sets that cover all seven continents, Amazon Route
     * 53 will receive some DNS queries from locations that it can't identify. We recommend that you create a resource
     * record set for which the value of <code>CountryCode</code> is <code>*</code>, which handles both queries that
     * come from locations for which you haven't created geolocation resource record sets and queries from IP addresses
     * that aren't mapped to a location. If you don't create a <code>*</code> resource record set, Amazon Route 53
     * returns a "no answer" response for queries from those locations.
     * </p>
     * </important>
     * <p>
     * You can't create non-geolocation resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as geolocation resource record sets.
     * </p>
     * 
     * @param geoLocation
     *        <i>Geo location resource record sets only:</i> A complex type that lets you control how Amazon Route 53
     *        responds to DNS queries based on the geographic origin of the query. For example, if you want all queries
     *        from Africa to be routed to a web server with an IP address of <code>192.0.2.111</code>, create a resource
     *        record set with a <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of <code>AF</code>
     *        .</p> <note>
     *        <p>
     *        Creating geolocation and geolocation alias resource record sets in private hosted zones is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        If you create separate resource record sets for overlapping geographic regions (for example, one resource
     *        record set for a continent and one for a country on the same continent), priority goes to the smallest
     *        geographic region. This allows you to route most queries for a continent to one resource and to route
     *        queries for a country on that continent to a different resource.
     *        </p>
     *        <p>
     *        You can't create two geolocation resource record sets that specify the same geographic location.
     *        </p>
     *        <p>
     *        The value <code>*</code> in the <code>CountryCode</code> element matches all geographic locations that
     *        aren't specified in other geolocation resource record sets that have the same values for the
     *        <code>Name</code> and <code>Type</code> elements.
     *        </p>
     *        <important>
     *        <p>
     *        Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't mapped to
     *        geographic locations, so even if you create geolocation resource record sets that cover all seven
     *        continents, Amazon Route 53 will receive some DNS queries from locations that it can't identify. We
     *        recommend that you create a resource record set for which the value of <code>CountryCode</code> is
     *        <code>*</code>, which handles both queries that come from locations for which you haven't created
     *        geolocation resource record sets and queries from IP addresses that aren't mapped to a location. If you
     *        don't create a <code>*</code> resource record set, Amazon Route 53 returns a "no answer" response for
     *        queries from those locations.
     *        </p>
     *        </important>
     *        <p>
     *        You can't create non-geolocation resource record sets that have the same values for the <code>Name</code>
     *        and <code>Type</code> elements as geolocation resource record sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withGeoLocation(GeoLocation geoLocation) {
        setGeoLocation(geoLocation);
        return this;
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code> element to
     * two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In addition, you
     * include the <code>HealthCheckId</code> element and specify the health check that you want Amazon Route 53 to
     * perform for each resource record set.
     * </p>
     * <p>
     * Except where noted, the following failover behaviors assume that you have included the <code>HealthCheckId</code>
     * element in both resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon Route
     * 53 responds to DNS queries with the applicable value from the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the primary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the primary
     * resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the applicable value from
     * the secondary resource record set. This is true regardless of the health of the associated endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code> element and
     * set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see the following topics in the <i>Amazon
     * Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param failover
     *        <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code>
     *        element to two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the
     *        value for <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In
     *        addition, you include the <code>HealthCheckId</code> element and specify the health check that you want
     *        Amazon Route 53 to perform for each resource record set.</p>
     *        <p>
     *        Except where noted, the following failover behaviors assume that you have included the
     *        <code>HealthCheckId</code> element in both resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the
     *        applicable value from the primary resource record set regardless of the health of the secondary resource
     *        record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon
     *        Route 53 responds to DNS queries with the applicable value from the secondary resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the
     *        applicable value from the primary resource record set regardless of the health of the primary resource
     *        record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the
     *        primary resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the
     *        applicable value from the secondary resource record set. This is true regardless of the health of the
     *        associated endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements as failover resource record sets.
     *        </p>
     *        <p>
     *        For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code>
     *        element and set the value to true.
     *        </p>
     *        <p>
     *        For more information about configuring failover for Amazon Route 53, see the following topics in the
     *        <i>Amazon Route 53 Developer Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53
     *        Health Checks and DNS Failover</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     *        Configuring Failover in a Private Hosted Zone</a>
     *        </p>
     *        </li>
     * @see ResourceRecordSetFailover
     */

    public void setFailover(String failover) {
        this.failover = failover;
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code> element to
     * two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In addition, you
     * include the <code>HealthCheckId</code> element and specify the health check that you want Amazon Route 53 to
     * perform for each resource record set.
     * </p>
     * <p>
     * Except where noted, the following failover behaviors assume that you have included the <code>HealthCheckId</code>
     * element in both resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon Route
     * 53 responds to DNS queries with the applicable value from the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the primary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the primary
     * resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the applicable value from
     * the secondary resource record set. This is true regardless of the health of the associated endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code> element and
     * set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see the following topics in the <i>Amazon
     * Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code>
     *         element to two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the
     *         value for <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>.
     *         In addition, you include the <code>HealthCheckId</code> element and specify the health check that you
     *         want Amazon Route 53 to perform for each resource record set.</p>
     *         <p>
     *         Except where noted, the following failover behaviors assume that you have included the
     *         <code>HealthCheckId</code> element in both resource record sets:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the
     *         applicable value from the primary resource record set regardless of the health of the secondary resource
     *         record set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When the primary resource record set is unhealthy and the secondary resource record set is healthy,
     *         Amazon Route 53 responds to DNS queries with the applicable value from the secondary resource record set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the
     *         applicable value from the primary resource record set regardless of the health of the primary resource
     *         record set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the
     *         primary resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the
     *         applicable value from the secondary resource record set. This is true regardless of the health of the
     *         associated endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can't create non-failover resource record sets that have the same values for the <code>Name</code>
     *         and <code>Type</code> elements as failover resource record sets.
     *         </p>
     *         <p>
     *         For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code>
     *         element and set the value to true.
     *         </p>
     *         <p>
     *         For more information about configuring failover for Amazon Route 53, see the following topics in the
     *         <i>Amazon Route 53 Developer Guide</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53
     *         Health Checks and DNS Failover</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     *         Configuring Failover in a Private Hosted Zone</a>
     *         </p>
     *         </li>
     * @see ResourceRecordSetFailover
     */

    public String getFailover() {
        return this.failover;
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code> element to
     * two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In addition, you
     * include the <code>HealthCheckId</code> element and specify the health check that you want Amazon Route 53 to
     * perform for each resource record set.
     * </p>
     * <p>
     * Except where noted, the following failover behaviors assume that you have included the <code>HealthCheckId</code>
     * element in both resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon Route
     * 53 responds to DNS queries with the applicable value from the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the primary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the primary
     * resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the applicable value from
     * the secondary resource record set. This is true regardless of the health of the associated endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code> element and
     * set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see the following topics in the <i>Amazon
     * Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param failover
     *        <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code>
     *        element to two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the
     *        value for <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In
     *        addition, you include the <code>HealthCheckId</code> element and specify the health check that you want
     *        Amazon Route 53 to perform for each resource record set.</p>
     *        <p>
     *        Except where noted, the following failover behaviors assume that you have included the
     *        <code>HealthCheckId</code> element in both resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the
     *        applicable value from the primary resource record set regardless of the health of the secondary resource
     *        record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon
     *        Route 53 responds to DNS queries with the applicable value from the secondary resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the
     *        applicable value from the primary resource record set regardless of the health of the primary resource
     *        record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the
     *        primary resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the
     *        applicable value from the secondary resource record set. This is true regardless of the health of the
     *        associated endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements as failover resource record sets.
     *        </p>
     *        <p>
     *        For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code>
     *        element and set the value to true.
     *        </p>
     *        <p>
     *        For more information about configuring failover for Amazon Route 53, see the following topics in the
     *        <i>Amazon Route 53 Developer Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53
     *        Health Checks and DNS Failover</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     *        Configuring Failover in a Private Hosted Zone</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRecordSetFailover
     */

    public ResourceRecordSet withFailover(String failover) {
        setFailover(failover);
        return this;
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code> element to
     * two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In addition, you
     * include the <code>HealthCheckId</code> element and specify the health check that you want Amazon Route 53 to
     * perform for each resource record set.
     * </p>
     * <p>
     * Except where noted, the following failover behaviors assume that you have included the <code>HealthCheckId</code>
     * element in both resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon Route
     * 53 responds to DNS queries with the applicable value from the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the primary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the primary
     * resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the applicable value from
     * the secondary resource record set. This is true regardless of the health of the associated endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code> element and
     * set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see the following topics in the <i>Amazon
     * Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param failover
     *        <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code>
     *        element to two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the
     *        value for <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In
     *        addition, you include the <code>HealthCheckId</code> element and specify the health check that you want
     *        Amazon Route 53 to perform for each resource record set.</p>
     *        <p>
     *        Except where noted, the following failover behaviors assume that you have included the
     *        <code>HealthCheckId</code> element in both resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the
     *        applicable value from the primary resource record set regardless of the health of the secondary resource
     *        record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon
     *        Route 53 responds to DNS queries with the applicable value from the secondary resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the
     *        applicable value from the primary resource record set regardless of the health of the primary resource
     *        record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the
     *        primary resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the
     *        applicable value from the secondary resource record set. This is true regardless of the health of the
     *        associated endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements as failover resource record sets.
     *        </p>
     *        <p>
     *        For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code>
     *        element and set the value to true.
     *        </p>
     *        <p>
     *        For more information about configuring failover for Amazon Route 53, see the following topics in the
     *        <i>Amazon Route 53 Developer Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53
     *        Health Checks and DNS Failover</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     *        Configuring Failover in a Private Hosted Zone</a>
     *        </p>
     *        </li>
     * @see ResourceRecordSetFailover
     */

    public void setFailover(ResourceRecordSetFailover failover) {
        withFailover(failover);
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code> element to
     * two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In addition, you
     * include the <code>HealthCheckId</code> element and specify the health check that you want Amazon Route 53 to
     * perform for each resource record set.
     * </p>
     * <p>
     * Except where noted, the following failover behaviors assume that you have included the <code>HealthCheckId</code>
     * element in both resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon Route
     * 53 responds to DNS queries with the applicable value from the secondary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the applicable
     * value from the primary resource record set regardless of the health of the primary resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the primary
     * resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the applicable value from
     * the secondary resource record set. This is true regardless of the health of the associated endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code> element and
     * set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see the following topics in the <i>Amazon
     * Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param failover
     *        <i>Failover resource record sets only:</i> To configure failover, you add the <code>Failover</code>
     *        element to two resource record sets. For one resource record set, you specify <code>PRIMARY</code> as the
     *        value for <code>Failover</code>; for the other resource record set, you specify <code>SECONDARY</code>. In
     *        addition, you include the <code>HealthCheckId</code> element and specify the health check that you want
     *        Amazon Route 53 to perform for each resource record set.</p>
     *        <p>
     *        Except where noted, the following failover behaviors assume that you have included the
     *        <code>HealthCheckId</code> element in both resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When the primary resource record set is healthy, Amazon Route 53 responds to DNS queries with the
     *        applicable value from the primary resource record set regardless of the health of the secondary resource
     *        record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When the primary resource record set is unhealthy and the secondary resource record set is healthy, Amazon
     *        Route 53 responds to DNS queries with the applicable value from the secondary resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When the secondary resource record set is unhealthy, Amazon Route 53 responds to DNS queries with the
     *        applicable value from the primary resource record set regardless of the health of the primary resource
     *        record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you omit the <code>HealthCheckId</code> element for the secondary resource record set, and if the
     *        primary resource record set is unhealthy, Amazon Route 53 always responds to DNS queries with the
     *        applicable value from the secondary resource record set. This is true regardless of the health of the
     *        associated endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't create non-failover resource record sets that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements as failover resource record sets.
     *        </p>
     *        <p>
     *        For failover alias resource record sets, you must also include the <code>EvaluateTargetHealth</code>
     *        element and set the value to true.
     *        </p>
     *        <p>
     *        For more information about configuring failover for Amazon Route 53, see the following topics in the
     *        <i>Amazon Route 53 Developer Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53
     *        Health Checks and DNS Failover</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     *        Configuring Failover in a Private Hosted Zone</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRecordSetFailover
     */

    public ResourceRecordSet withFailover(ResourceRecordSetFailover failover) {
        this.failover = failover.toString();
        return this;
    }

    /**
     * <p>
     * <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     * resources, such as web servers, create one multivalue answer record for each resource and specify
     * <code>true</code> for <code>MultiValueAnswer</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to DNS
     * queries with the corresponding IP address only when the health check is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers the
     * record to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer healthy
     * records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with different
     * combinations of healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a resource becomes unavailable after a resolver caches a response, client software typically tries another of
     * the IP addresses in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create multivalue answer alias records.
     * </p>
     * 
     * @param multiValueAnswer
     *        <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     *        resources, such as web servers, create one multivalue answer record for each resource and specify
     *        <code>true</code> for <code>MultiValueAnswer</code>. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to
     *        DNS queries with the corresponding IP address only when the health check is healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers
     *        the record to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer
     *        healthy records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with
     *        different combinations of healthy records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy
     *        records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a resource becomes unavailable after a resolver caches a response, client software typically tries
     *        another of the IP addresses in the response.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't create multivalue answer alias records.
     */

    public void setMultiValueAnswer(Boolean multiValueAnswer) {
        this.multiValueAnswer = multiValueAnswer;
    }

    /**
     * <p>
     * <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     * resources, such as web servers, create one multivalue answer record for each resource and specify
     * <code>true</code> for <code>MultiValueAnswer</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to DNS
     * queries with the corresponding IP address only when the health check is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers the
     * record to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer healthy
     * records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with different
     * combinations of healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a resource becomes unavailable after a resolver caches a response, client software typically tries another of
     * the IP addresses in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create multivalue answer alias records.
     * </p>
     * 
     * @return <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     *         resources, such as web servers, create one multivalue answer record for each resource and specify
     *         <code>true</code> for <code>MultiValueAnswer</code>. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to
     *         DNS queries with the corresponding IP address only when the health check is healthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers
     *         the record to be healthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer
     *         healthy records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with
     *         different combinations of healthy records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy
     *         records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a resource becomes unavailable after a resolver caches a response, client software typically tries
     *         another of the IP addresses in the response.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can't create multivalue answer alias records.
     */

    public Boolean getMultiValueAnswer() {
        return this.multiValueAnswer;
    }

    /**
     * <p>
     * <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     * resources, such as web servers, create one multivalue answer record for each resource and specify
     * <code>true</code> for <code>MultiValueAnswer</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to DNS
     * queries with the corresponding IP address only when the health check is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers the
     * record to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer healthy
     * records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with different
     * combinations of healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a resource becomes unavailable after a resolver caches a response, client software typically tries another of
     * the IP addresses in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create multivalue answer alias records.
     * </p>
     * 
     * @param multiValueAnswer
     *        <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     *        resources, such as web servers, create one multivalue answer record for each resource and specify
     *        <code>true</code> for <code>MultiValueAnswer</code>. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to
     *        DNS queries with the corresponding IP address only when the health check is healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers
     *        the record to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer
     *        healthy records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with
     *        different combinations of healthy records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy
     *        records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a resource becomes unavailable after a resolver caches a response, client software typically tries
     *        another of the IP addresses in the response.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't create multivalue answer alias records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withMultiValueAnswer(Boolean multiValueAnswer) {
        setMultiValueAnswer(multiValueAnswer);
        return this;
    }

    /**
     * <p>
     * <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     * resources, such as web servers, create one multivalue answer record for each resource and specify
     * <code>true</code> for <code>MultiValueAnswer</code>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to DNS
     * queries with the corresponding IP address only when the health check is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers the
     * record to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer healthy
     * records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with different
     * combinations of healthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy records.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a resource becomes unavailable after a resolver caches a response, client software typically tries another of
     * the IP addresses in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't create multivalue answer alias records.
     * </p>
     * 
     * @return <i>Multivalue answer resource record sets only</i>: To route traffic approximately randomly to multiple
     *         resources, such as web servers, create one multivalue answer record for each resource and specify
     *         <code>true</code> for <code>MultiValueAnswer</code>. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to
     *         DNS queries with the corresponding IP address only when the health check is healthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't associate a health check with a multivalue answer record, Amazon Route 53 always considers
     *         the record to be healthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer
     *         healthy records, Amazon Route 53 responds to all DNS queries with all the healthy records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you have more than eight healthy records, Amazon Route 53 responds to different DNS resolvers with
     *         different combinations of healthy records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When all records are unhealthy, Amazon Route 53 responds to DNS queries with up to eight unhealthy
     *         records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a resource becomes unavailable after a resolver caches a response, client software typically tries
     *         another of the IP addresses in the response.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can't create multivalue answer alias records.
     */

    public Boolean isMultiValueAnswer() {
        return this.multiValueAnswer;
    }

    /**
     * <p>
     * The resource record cache time to live (TTL), in seconds. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you're creating or updating an alias resource record set, omit <code>TTL</code>. Amazon Route 53 uses the
     * value of <code>TTL</code> for the alias target.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're associating this resource record set with a health check (if you're adding a <code>HealthCheckId</code>
     * element), we recommend that you specify a <code>TTL</code> of 60 seconds or less so clients respond quickly to
     * changes in health status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the resource record sets in a group of weighted resource record sets must have the same value for
     * <code>TTL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a group of weighted resource record sets includes one or more weighted alias resource record sets for which
     * the alias target is an ELB load balancer, we recommend that you specify a <code>TTL</code> of 60 seconds for all
     * of the non-alias weighted resource record sets that have the same name and type. Values other than 60 seconds
     * (the TTL for load balancers) will change the effect of the values that you specify for <code>Weight</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tTL
     *        The resource record cache time to live (TTL), in seconds. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you're creating or updating an alias resource record set, omit <code>TTL</code>. Amazon Route 53 uses
     *        the value of <code>TTL</code> for the alias target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're associating this resource record set with a health check (if you're adding a
     *        <code>HealthCheckId</code> element), we recommend that you specify a <code>TTL</code> of 60 seconds or
     *        less so clients respond quickly to changes in health status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All of the resource record sets in a group of weighted resource record sets must have the same value for
     *        <code>TTL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a group of weighted resource record sets includes one or more weighted alias resource record sets for
     *        which the alias target is an ELB load balancer, we recommend that you specify a <code>TTL</code> of 60
     *        seconds for all of the non-alias weighted resource record sets that have the same name and type. Values
     *        other than 60 seconds (the TTL for load balancers) will change the effect of the values that you specify
     *        for <code>Weight</code>.
     *        </p>
     *        </li>
     */

    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The resource record cache time to live (TTL), in seconds. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you're creating or updating an alias resource record set, omit <code>TTL</code>. Amazon Route 53 uses the
     * value of <code>TTL</code> for the alias target.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're associating this resource record set with a health check (if you're adding a <code>HealthCheckId</code>
     * element), we recommend that you specify a <code>TTL</code> of 60 seconds or less so clients respond quickly to
     * changes in health status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the resource record sets in a group of weighted resource record sets must have the same value for
     * <code>TTL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a group of weighted resource record sets includes one or more weighted alias resource record sets for which
     * the alias target is an ELB load balancer, we recommend that you specify a <code>TTL</code> of 60 seconds for all
     * of the non-alias weighted resource record sets that have the same name and type. Values other than 60 seconds
     * (the TTL for load balancers) will change the effect of the values that you specify for <code>Weight</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resource record cache time to live (TTL), in seconds. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you're creating or updating an alias resource record set, omit <code>TTL</code>. Amazon Route 53 uses
     *         the value of <code>TTL</code> for the alias target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you're associating this resource record set with a health check (if you're adding a
     *         <code>HealthCheckId</code> element), we recommend that you specify a <code>TTL</code> of 60 seconds or
     *         less so clients respond quickly to changes in health status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All of the resource record sets in a group of weighted resource record sets must have the same value for
     *         <code>TTL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a group of weighted resource record sets includes one or more weighted alias resource record sets for
     *         which the alias target is an ELB load balancer, we recommend that you specify a <code>TTL</code> of 60
     *         seconds for all of the non-alias weighted resource record sets that have the same name and type. Values
     *         other than 60 seconds (the TTL for load balancers) will change the effect of the values that you specify
     *         for <code>Weight</code>.
     *         </p>
     *         </li>
     */

    public Long getTTL() {
        return this.tTL;
    }

    /**
     * <p>
     * The resource record cache time to live (TTL), in seconds. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you're creating or updating an alias resource record set, omit <code>TTL</code>. Amazon Route 53 uses the
     * value of <code>TTL</code> for the alias target.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're associating this resource record set with a health check (if you're adding a <code>HealthCheckId</code>
     * element), we recommend that you specify a <code>TTL</code> of 60 seconds or less so clients respond quickly to
     * changes in health status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the resource record sets in a group of weighted resource record sets must have the same value for
     * <code>TTL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a group of weighted resource record sets includes one or more weighted alias resource record sets for which
     * the alias target is an ELB load balancer, we recommend that you specify a <code>TTL</code> of 60 seconds for all
     * of the non-alias weighted resource record sets that have the same name and type. Values other than 60 seconds
     * (the TTL for load balancers) will change the effect of the values that you specify for <code>Weight</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tTL
     *        The resource record cache time to live (TTL), in seconds. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you're creating or updating an alias resource record set, omit <code>TTL</code>. Amazon Route 53 uses
     *        the value of <code>TTL</code> for the alias target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're associating this resource record set with a health check (if you're adding a
     *        <code>HealthCheckId</code> element), we recommend that you specify a <code>TTL</code> of 60 seconds or
     *        less so clients respond quickly to changes in health status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All of the resource record sets in a group of weighted resource record sets must have the same value for
     *        <code>TTL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a group of weighted resource record sets includes one or more weighted alias resource record sets for
     *        which the alias target is an ELB load balancer, we recommend that you specify a <code>TTL</code> of 60
     *        seconds for all of the non-alias weighted resource record sets that have the same name and type. Values
     *        other than 60 seconds (the TTL for load balancers) will change the effect of the values that you specify
     *        for <code>Weight</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withTTL(Long tTL) {
        setTTL(tTL);
        return this;
    }

    /**
     * <p>
     * Information about the resource records to act upon.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     * </p>
     * </note>
     * 
     * @return Information about the resource records to act upon.</p> <note>
     *         <p>
     *         If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     *         </p>
     */

    public java.util.List<ResourceRecord> getResourceRecords() {
        if (resourceRecords == null) {
            resourceRecords = new com.amazonaws.internal.SdkInternalList<ResourceRecord>();
        }
        return resourceRecords;
    }

    /**
     * <p>
     * Information about the resource records to act upon.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     * </p>
     * </note>
     * 
     * @param resourceRecords
     *        Information about the resource records to act upon.</p> <note>
     *        <p>
     *        If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     *        </p>
     */

    public void setResourceRecords(java.util.Collection<ResourceRecord> resourceRecords) {
        if (resourceRecords == null) {
            this.resourceRecords = null;
            return;
        }

        this.resourceRecords = new com.amazonaws.internal.SdkInternalList<ResourceRecord>(resourceRecords);
    }

    /**
     * <p>
     * Information about the resource records to act upon.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRecords(java.util.Collection)} or {@link #withResourceRecords(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceRecords
     *        Information about the resource records to act upon.</p> <note>
     *        <p>
     *        If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withResourceRecords(ResourceRecord... resourceRecords) {
        if (this.resourceRecords == null) {
            setResourceRecords(new com.amazonaws.internal.SdkInternalList<ResourceRecord>(resourceRecords.length));
        }
        for (ResourceRecord ele : resourceRecords) {
            this.resourceRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource records to act upon.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     * </p>
     * </note>
     * 
     * @param resourceRecords
     *        Information about the resource records to act upon.</p> <note>
     *        <p>
     *        If you're creating an alias resource record set, omit <code>ResourceRecords</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withResourceRecords(java.util.Collection<ResourceRecord> resourceRecords) {
        setResourceRecords(resourceRecords);
        return this;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> Information about the CloudFront distribution, AWS Elastic Beanstalk
     * environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set to which you're
     * redirecting queries. The AWS Elastic Beanstalk environment must have a regionalized subdomain.
     * </p>
     * <p>
     * If you're creating resource records sets for a private hosted zone, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create alias resource record sets for CloudFront distributions in a private hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is
     * unsupported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about creating failover resource record sets in a private hosted zone, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html"
     * >Configuring Failover in a Private Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aliasTarget
     *        <i>Alias resource record sets only:</i> Information about the CloudFront distribution, AWS Elastic
     *        Beanstalk environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set to
     *        which you're redirecting queries. The AWS Elastic Beanstalk environment must have a regionalized
     *        subdomain.</p>
     *        <p>
     *        If you're creating resource records sets for a private hosted zone, note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't create alias resource record sets for CloudFront distributions in a private hosted zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted
     *        zone is unsupported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For information about creating failover resource record sets in a private hosted zone, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html"
     *        >Configuring Failover in a Private Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        </li>
     */

    public void setAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> Information about the CloudFront distribution, AWS Elastic Beanstalk
     * environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set to which you're
     * redirecting queries. The AWS Elastic Beanstalk environment must have a regionalized subdomain.
     * </p>
     * <p>
     * If you're creating resource records sets for a private hosted zone, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create alias resource record sets for CloudFront distributions in a private hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is
     * unsupported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about creating failover resource record sets in a private hosted zone, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html"
     * >Configuring Failover in a Private Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <i>Alias resource record sets only:</i> Information about the CloudFront distribution, AWS Elastic
     *         Beanstalk environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set to
     *         which you're redirecting queries. The AWS Elastic Beanstalk environment must have a regionalized
     *         subdomain.</p>
     *         <p>
     *         If you're creating resource records sets for a private hosted zone, note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't create alias resource record sets for CloudFront distributions in a private hosted zone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted
     *         zone is unsupported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For information about creating failover resource record sets in a private hosted zone, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html"
     *         >Configuring Failover in a Private Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         </li>
     */

    public AliasTarget getAliasTarget() {
        return this.aliasTarget;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> Information about the CloudFront distribution, AWS Elastic Beanstalk
     * environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set to which you're
     * redirecting queries. The AWS Elastic Beanstalk environment must have a regionalized subdomain.
     * </p>
     * <p>
     * If you're creating resource records sets for a private hosted zone, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create alias resource record sets for CloudFront distributions in a private hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is
     * unsupported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about creating failover resource record sets in a private hosted zone, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html"
     * >Configuring Failover in a Private Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aliasTarget
     *        <i>Alias resource record sets only:</i> Information about the CloudFront distribution, AWS Elastic
     *        Beanstalk environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set to
     *        which you're redirecting queries. The AWS Elastic Beanstalk environment must have a regionalized
     *        subdomain.</p>
     *        <p>
     *        If you're creating resource records sets for a private hosted zone, note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't create alias resource record sets for CloudFront distributions in a private hosted zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted
     *        zone is unsupported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For information about creating failover resource record sets in a private hosted zone, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html"
     *        >Configuring Failover in a Private Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withAliasTarget(AliasTarget aliasTarget) {
        setAliasTarget(aliasTarget);
        return this;
    }

    /**
     * <p>
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a health
     * check is passing, include the <code>HealthCheckId</code> element and specify the ID of the applicable health
     * check.
     * </p>
     * <p>
     * Amazon Route 53 determines whether a resource record set is healthy based on one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By periodically sending a request to the endpoint that is specified in the health check
     * </p>
     * </li>
     * <li>
     * <p>
     * By aggregating the status of a specified group of health checks (calculated health checks)
     * </p>
     * </li>
     * <li>
     * <p>
     * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a>.
     * </p>
     * <p>
     * The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     * resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on the
     * status of a health check. Configuring health checks only makes sense in the following configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're checking the health of the resource record sets in a group of weighted, latency, geolocation, or failover
     * resource record sets, and you specify health check IDs for all of the resource record sets. If the health check
     * for one resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops responding to
     * queries using the value for that resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You set <code>EvaluateTargetHealth</code> to true for the resource record sets in a group of alias, weighted
     * alias, latency alias, geolocation alias, or failover alias resource record sets, and you specify health check IDs
     * for all of the resource record sets that are referenced by the alias resource record sets.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for example, the
     * endpoint specified by the IP address in the <code>Value</code> element. When you add a <code>HealthCheckId</code>
     * element to a resource record set, Amazon Route 53 checks the health of the endpoint that you specified in the
     * health check.
     * </p>
     * </important>
     * <p>
     * For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource record
     * set for the larger, associated geographic region. For example, suppose you have resource record sets for a state
     * in the United States, for the United States, for North America, and for all locations. If the endpoint for the
     * state resource record set is unhealthy, Amazon Route 53 checks the resource record sets for the United States,
     * for North America, and for all locations (a resource record set for which the value of <code>CountryCode</code>
     * is <code>*</code>), in that order, until it finds a resource record set for which the endpoint is healthy.
     * </p>
     * <p>
     * If your health checks specify the endpoint only by domain name, we recommend that you create a separate health
     * check for each endpoint. For example, create a health check for each <code>HTTP</code> server that is serving
     * content for <code>www.example.com</code>. For the value of <code>FullyQualifiedDomainName</code>, specify the
     * domain name of the server (such as <code>us-east-2-www.example.com</code>), not the name of the resource record
     * sets (example.com).
     * </p>
     * <important>
     * <p>
     * n this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and then associate the health check with those resource record sets,
     * health check results will be unpredictable.
     * </p>
     * </important>
     * <p>
     * For more information, see the following topics in the <i>Amazon Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param healthCheckId
     *        If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a
     *        health check is passing, include the <code>HealthCheckId</code> element and specify the ID of the
     *        applicable health check.</p>
     *        <p>
     *        Amazon Route 53 determines whether a resource record set is healthy based on one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By periodically sending a request to the endpoint that is specified in the health check
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        By aggregating the status of a specified group of health checks (calculated health checks)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a>.
     *        </p>
     *        <p>
     *        The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     *        resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on
     *        the status of a health check. Configuring health checks only makes sense in the following configurations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're checking the health of the resource record sets in a group of weighted, latency, geolocation, or
     *        failover resource record sets, and you specify health check IDs for all of the resource record sets. If
     *        the health check for one resource record set specifies an endpoint that is not healthy, Amazon Route 53
     *        stops responding to queries using the value for that resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You set <code>EvaluateTargetHealth</code> to true for the resource record sets in a group of alias,
     *        weighted alias, latency alias, geolocation alias, or failover alias resource record sets, and you specify
     *        health check IDs for all of the resource record sets that are referenced by the alias resource record
     *        sets.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for
     *        example, the endpoint specified by the IP address in the <code>Value</code> element. When you add a
     *        <code>HealthCheckId</code> element to a resource record set, Amazon Route 53 checks the health of the
     *        endpoint that you specified in the health check.
     *        </p>
     *        </important>
     *        <p>
     *        For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource
     *        record set for the larger, associated geographic region. For example, suppose you have resource record
     *        sets for a state in the United States, for the United States, for North America, and for all locations. If
     *        the endpoint for the state resource record set is unhealthy, Amazon Route 53 checks the resource record
     *        sets for the United States, for North America, and for all locations (a resource record set for which the
     *        value of <code>CountryCode</code> is <code>*</code>), in that order, until it finds a resource record set
     *        for which the endpoint is healthy.
     *        </p>
     *        <p>
     *        If your health checks specify the endpoint only by domain name, we recommend that you create a separate
     *        health check for each endpoint. For example, create a health check for each <code>HTTP</code> server that
     *        is serving content for <code>www.example.com</code>. For the value of
     *        <code>FullyQualifiedDomainName</code>, specify the domain name of the server (such as
     *        <code>us-east-2-www.example.com</code>), not the name of the resource record sets (example.com).
     *        </p>
     *        <important>
     *        <p>
     *        n this configuration, if you create a health check for which the value of
     *        <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and then associate the
     *        health check with those resource record sets, health check results will be unpredictable.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, see the following topics in the <i>Amazon Route 53 Developer Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53
     *        Health Checks and DNS Failover</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     *        Configuring Failover in a Private Hosted Zone</a>
     *        </p>
     *        </li>
     */

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a health
     * check is passing, include the <code>HealthCheckId</code> element and specify the ID of the applicable health
     * check.
     * </p>
     * <p>
     * Amazon Route 53 determines whether a resource record set is healthy based on one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By periodically sending a request to the endpoint that is specified in the health check
     * </p>
     * </li>
     * <li>
     * <p>
     * By aggregating the status of a specified group of health checks (calculated health checks)
     * </p>
     * </li>
     * <li>
     * <p>
     * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a>.
     * </p>
     * <p>
     * The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     * resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on the
     * status of a health check. Configuring health checks only makes sense in the following configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're checking the health of the resource record sets in a group of weighted, latency, geolocation, or failover
     * resource record sets, and you specify health check IDs for all of the resource record sets. If the health check
     * for one resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops responding to
     * queries using the value for that resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You set <code>EvaluateTargetHealth</code> to true for the resource record sets in a group of alias, weighted
     * alias, latency alias, geolocation alias, or failover alias resource record sets, and you specify health check IDs
     * for all of the resource record sets that are referenced by the alias resource record sets.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for example, the
     * endpoint specified by the IP address in the <code>Value</code> element. When you add a <code>HealthCheckId</code>
     * element to a resource record set, Amazon Route 53 checks the health of the endpoint that you specified in the
     * health check.
     * </p>
     * </important>
     * <p>
     * For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource record
     * set for the larger, associated geographic region. For example, suppose you have resource record sets for a state
     * in the United States, for the United States, for North America, and for all locations. If the endpoint for the
     * state resource record set is unhealthy, Amazon Route 53 checks the resource record sets for the United States,
     * for North America, and for all locations (a resource record set for which the value of <code>CountryCode</code>
     * is <code>*</code>), in that order, until it finds a resource record set for which the endpoint is healthy.
     * </p>
     * <p>
     * If your health checks specify the endpoint only by domain name, we recommend that you create a separate health
     * check for each endpoint. For example, create a health check for each <code>HTTP</code> server that is serving
     * content for <code>www.example.com</code>. For the value of <code>FullyQualifiedDomainName</code>, specify the
     * domain name of the server (such as <code>us-east-2-www.example.com</code>), not the name of the resource record
     * sets (example.com).
     * </p>
     * <important>
     * <p>
     * n this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and then associate the health check with those resource record sets,
     * health check results will be unpredictable.
     * </p>
     * </important>
     * <p>
     * For more information, see the following topics in the <i>Amazon Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a
     *         health check is passing, include the <code>HealthCheckId</code> element and specify the ID of the
     *         applicable health check.</p>
     *         <p>
     *         Amazon Route 53 determines whether a resource record set is healthy based on one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         By periodically sending a request to the endpoint that is specified in the health check
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         By aggregating the status of a specified group of health checks (calculated health checks)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *         >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a>.
     *         </p>
     *         <p>
     *         The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or
     *         more resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in
     *         part on the status of a health check. Configuring health checks only makes sense in the following
     *         configurations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You're checking the health of the resource record sets in a group of weighted, latency, geolocation, or
     *         failover resource record sets, and you specify health check IDs for all of the resource record sets. If
     *         the health check for one resource record set specifies an endpoint that is not healthy, Amazon Route 53
     *         stops responding to queries using the value for that resource record set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You set <code>EvaluateTargetHealth</code> to true for the resource record sets in a group of alias,
     *         weighted alias, latency alias, geolocation alias, or failover alias resource record sets, and you specify
     *         health check IDs for all of the resource record sets that are referenced by the alias resource record
     *         sets.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for
     *         example, the endpoint specified by the IP address in the <code>Value</code> element. When you add a
     *         <code>HealthCheckId</code> element to a resource record set, Amazon Route 53 checks the health of the
     *         endpoint that you specified in the health check.
     *         </p>
     *         </important>
     *         <p>
     *         For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource
     *         record set for the larger, associated geographic region. For example, suppose you have resource record
     *         sets for a state in the United States, for the United States, for North America, and for all locations.
     *         If the endpoint for the state resource record set is unhealthy, Amazon Route 53 checks the resource
     *         record sets for the United States, for North America, and for all locations (a resource record set for
     *         which the value of <code>CountryCode</code> is <code>*</code>), in that order, until it finds a resource
     *         record set for which the endpoint is healthy.
     *         </p>
     *         <p>
     *         If your health checks specify the endpoint only by domain name, we recommend that you create a separate
     *         health check for each endpoint. For example, create a health check for each <code>HTTP</code> server that
     *         is serving content for <code>www.example.com</code>. For the value of
     *         <code>FullyQualifiedDomainName</code>, specify the domain name of the server (such as
     *         <code>us-east-2-www.example.com</code>), not the name of the resource record sets (example.com).
     *         </p>
     *         <important>
     *         <p>
     *         n this configuration, if you create a health check for which the value of
     *         <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and then associate the
     *         health check with those resource record sets, health check results will be unpredictable.
     *         </p>
     *         </important>
     *         <p>
     *         For more information, see the following topics in the <i>Amazon Route 53 Developer Guide</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53
     *         Health Checks and DNS Failover</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     *         Configuring Failover in a Private Hosted Zone</a>
     *         </p>
     *         </li>
     */

    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * <p>
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a health
     * check is passing, include the <code>HealthCheckId</code> element and specify the ID of the applicable health
     * check.
     * </p>
     * <p>
     * Amazon Route 53 determines whether a resource record set is healthy based on one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By periodically sending a request to the endpoint that is specified in the health check
     * </p>
     * </li>
     * <li>
     * <p>
     * By aggregating the status of a specified group of health checks (calculated health checks)
     * </p>
     * </li>
     * <li>
     * <p>
     * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a>.
     * </p>
     * <p>
     * The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     * resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on the
     * status of a health check. Configuring health checks only makes sense in the following configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're checking the health of the resource record sets in a group of weighted, latency, geolocation, or failover
     * resource record sets, and you specify health check IDs for all of the resource record sets. If the health check
     * for one resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops responding to
     * queries using the value for that resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You set <code>EvaluateTargetHealth</code> to true for the resource record sets in a group of alias, weighted
     * alias, latency alias, geolocation alias, or failover alias resource record sets, and you specify health check IDs
     * for all of the resource record sets that are referenced by the alias resource record sets.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for example, the
     * endpoint specified by the IP address in the <code>Value</code> element. When you add a <code>HealthCheckId</code>
     * element to a resource record set, Amazon Route 53 checks the health of the endpoint that you specified in the
     * health check.
     * </p>
     * </important>
     * <p>
     * For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource record
     * set for the larger, associated geographic region. For example, suppose you have resource record sets for a state
     * in the United States, for the United States, for North America, and for all locations. If the endpoint for the
     * state resource record set is unhealthy, Amazon Route 53 checks the resource record sets for the United States,
     * for North America, and for all locations (a resource record set for which the value of <code>CountryCode</code>
     * is <code>*</code>), in that order, until it finds a resource record set for which the endpoint is healthy.
     * </p>
     * <p>
     * If your health checks specify the endpoint only by domain name, we recommend that you create a separate health
     * check for each endpoint. For example, create a health check for each <code>HTTP</code> server that is serving
     * content for <code>www.example.com</code>. For the value of <code>FullyQualifiedDomainName</code>, specify the
     * domain name of the server (such as <code>us-east-2-www.example.com</code>), not the name of the resource record
     * sets (example.com).
     * </p>
     * <important>
     * <p>
     * n this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and then associate the health check with those resource record sets,
     * health check results will be unpredictable.
     * </p>
     * </important>
     * <p>
     * For more information, see the following topics in the <i>Amazon Route 53 Developer Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     * Checks and DNS Failover</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     * Configuring Failover in a Private Hosted Zone</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param healthCheckId
     *        If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a
     *        health check is passing, include the <code>HealthCheckId</code> element and specify the ID of the
     *        applicable health check.</p>
     *        <p>
     *        Amazon Route 53 determines whether a resource record set is healthy based on one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By periodically sending a request to the endpoint that is specified in the health check
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        By aggregating the status of a specified group of health checks (calculated health checks)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a>.
     *        </p>
     *        <p>
     *        The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     *        resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on
     *        the status of a health check. Configuring health checks only makes sense in the following configurations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're checking the health of the resource record sets in a group of weighted, latency, geolocation, or
     *        failover resource record sets, and you specify health check IDs for all of the resource record sets. If
     *        the health check for one resource record set specifies an endpoint that is not healthy, Amazon Route 53
     *        stops responding to queries using the value for that resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You set <code>EvaluateTargetHealth</code> to true for the resource record sets in a group of alias,
     *        weighted alias, latency alias, geolocation alias, or failover alias resource record sets, and you specify
     *        health check IDs for all of the resource record sets that are referenced by the alias resource record
     *        sets.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for
     *        example, the endpoint specified by the IP address in the <code>Value</code> element. When you add a
     *        <code>HealthCheckId</code> element to a resource record set, Amazon Route 53 checks the health of the
     *        endpoint that you specified in the health check.
     *        </p>
     *        </important>
     *        <p>
     *        For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource
     *        record set for the larger, associated geographic region. For example, suppose you have resource record
     *        sets for a state in the United States, for the United States, for North America, and for all locations. If
     *        the endpoint for the state resource record set is unhealthy, Amazon Route 53 checks the resource record
     *        sets for the United States, for North America, and for all locations (a resource record set for which the
     *        value of <code>CountryCode</code> is <code>*</code>), in that order, until it finds a resource record set
     *        for which the endpoint is healthy.
     *        </p>
     *        <p>
     *        If your health checks specify the endpoint only by domain name, we recommend that you create a separate
     *        health check for each endpoint. For example, create a health check for each <code>HTTP</code> server that
     *        is serving content for <code>www.example.com</code>. For the value of
     *        <code>FullyQualifiedDomainName</code>, specify the domain name of the server (such as
     *        <code>us-east-2-www.example.com</code>), not the name of the resource record sets (example.com).
     *        </p>
     *        <important>
     *        <p>
     *        n this configuration, if you create a health check for which the value of
     *        <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and then associate the
     *        health check with those resource record sets, health check results will be unpredictable.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, see the following topics in the <i>Amazon Route 53 Developer Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53
     *        Health Checks and DNS Failover</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">
     *        Configuring Failover in a Private Hosted Zone</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
        return this;
    }

    /**
     * <p>
     * When you create a traffic policy instance, Amazon Route 53 automatically creates a resource record set.
     * <code>TrafficPolicyInstanceId</code> is the ID of the traffic policy instance that Amazon Route 53 created this
     * resource record set for.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use
     * <code>DeleteTrafficPolicyInstance</code>. Amazon Route 53 will delete the resource record set automatically. If
     * you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Amazon Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to be charged for it even though it's no
     * longer in use.
     * </p>
     * </important>
     * 
     * @param trafficPolicyInstanceId
     *        When you create a traffic policy instance, Amazon Route 53 automatically creates a resource record set.
     *        <code>TrafficPolicyInstanceId</code> is the ID of the traffic policy instance that Amazon Route 53 created
     *        this resource record set for.</p> <important>
     *        <p>
     *        To delete the resource record set that is associated with a traffic policy instance, use
     *        <code>DeleteTrafficPolicyInstance</code>. Amazon Route 53 will delete the resource record set
     *        automatically. If you delete the resource record set by using <code>ChangeResourceRecordSets</code>,
     *        Amazon Route 53 doesn't automatically delete the traffic policy instance, and you'll continue to be
     *        charged for it even though it's no longer in use.
     *        </p>
     */

    public void setTrafficPolicyInstanceId(String trafficPolicyInstanceId) {
        this.trafficPolicyInstanceId = trafficPolicyInstanceId;
    }

    /**
     * <p>
     * When you create a traffic policy instance, Amazon Route 53 automatically creates a resource record set.
     * <code>TrafficPolicyInstanceId</code> is the ID of the traffic policy instance that Amazon Route 53 created this
     * resource record set for.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use
     * <code>DeleteTrafficPolicyInstance</code>. Amazon Route 53 will delete the resource record set automatically. If
     * you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Amazon Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to be charged for it even though it's no
     * longer in use.
     * </p>
     * </important>
     * 
     * @return When you create a traffic policy instance, Amazon Route 53 automatically creates a resource record set.
     *         <code>TrafficPolicyInstanceId</code> is the ID of the traffic policy instance that Amazon Route 53
     *         created this resource record set for.</p> <important>
     *         <p>
     *         To delete the resource record set that is associated with a traffic policy instance, use
     *         <code>DeleteTrafficPolicyInstance</code>. Amazon Route 53 will delete the resource record set
     *         automatically. If you delete the resource record set by using <code>ChangeResourceRecordSets</code>,
     *         Amazon Route 53 doesn't automatically delete the traffic policy instance, and you'll continue to be
     *         charged for it even though it's no longer in use.
     *         </p>
     */

    public String getTrafficPolicyInstanceId() {
        return this.trafficPolicyInstanceId;
    }

    /**
     * <p>
     * When you create a traffic policy instance, Amazon Route 53 automatically creates a resource record set.
     * <code>TrafficPolicyInstanceId</code> is the ID of the traffic policy instance that Amazon Route 53 created this
     * resource record set for.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic policy instance, use
     * <code>DeleteTrafficPolicyInstance</code>. Amazon Route 53 will delete the resource record set automatically. If
     * you delete the resource record set by using <code>ChangeResourceRecordSets</code>, Amazon Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to be charged for it even though it's no
     * longer in use.
     * </p>
     * </important>
     * 
     * @param trafficPolicyInstanceId
     *        When you create a traffic policy instance, Amazon Route 53 automatically creates a resource record set.
     *        <code>TrafficPolicyInstanceId</code> is the ID of the traffic policy instance that Amazon Route 53 created
     *        this resource record set for.</p> <important>
     *        <p>
     *        To delete the resource record set that is associated with a traffic policy instance, use
     *        <code>DeleteTrafficPolicyInstance</code>. Amazon Route 53 will delete the resource record set
     *        automatically. If you delete the resource record set by using <code>ChangeResourceRecordSets</code>,
     *        Amazon Route 53 doesn't automatically delete the traffic policy instance, and you'll continue to be
     *        charged for it even though it's no longer in use.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecordSet withTrafficPolicyInstanceId(String trafficPolicyInstanceId) {
        setTrafficPolicyInstanceId(trafficPolicyInstanceId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSetIdentifier() != null)
            sb.append("SetIdentifier: ").append(getSetIdentifier()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getGeoLocation() != null)
            sb.append("GeoLocation: ").append(getGeoLocation()).append(",");
        if (getFailover() != null)
            sb.append("Failover: ").append(getFailover()).append(",");
        if (getMultiValueAnswer() != null)
            sb.append("MultiValueAnswer: ").append(getMultiValueAnswer()).append(",");
        if (getTTL() != null)
            sb.append("TTL: ").append(getTTL()).append(",");
        if (getResourceRecords() != null)
            sb.append("ResourceRecords: ").append(getResourceRecords()).append(",");
        if (getAliasTarget() != null)
            sb.append("AliasTarget: ").append(getAliasTarget()).append(",");
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: ").append(getHealthCheckId()).append(",");
        if (getTrafficPolicyInstanceId() != null)
            sb.append("TrafficPolicyInstanceId: ").append(getTrafficPolicyInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceRecordSet == false)
            return false;
        ResourceRecordSet other = (ResourceRecordSet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSetIdentifier() == null ^ this.getSetIdentifier() == null)
            return false;
        if (other.getSetIdentifier() != null && other.getSetIdentifier().equals(this.getSetIdentifier()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getGeoLocation() == null ^ this.getGeoLocation() == null)
            return false;
        if (other.getGeoLocation() != null && other.getGeoLocation().equals(this.getGeoLocation()) == false)
            return false;
        if (other.getFailover() == null ^ this.getFailover() == null)
            return false;
        if (other.getFailover() != null && other.getFailover().equals(this.getFailover()) == false)
            return false;
        if (other.getMultiValueAnswer() == null ^ this.getMultiValueAnswer() == null)
            return false;
        if (other.getMultiValueAnswer() != null && other.getMultiValueAnswer().equals(this.getMultiValueAnswer()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false)
            return false;
        if (other.getResourceRecords() == null ^ this.getResourceRecords() == null)
            return false;
        if (other.getResourceRecords() != null && other.getResourceRecords().equals(this.getResourceRecords()) == false)
            return false;
        if (other.getAliasTarget() == null ^ this.getAliasTarget() == null)
            return false;
        if (other.getAliasTarget() != null && other.getAliasTarget().equals(this.getAliasTarget()) == false)
            return false;
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        if (other.getTrafficPolicyInstanceId() == null ^ this.getTrafficPolicyInstanceId() == null)
            return false;
        if (other.getTrafficPolicyInstanceId() != null && other.getTrafficPolicyInstanceId().equals(this.getTrafficPolicyInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSetIdentifier() == null) ? 0 : getSetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getGeoLocation() == null) ? 0 : getGeoLocation().hashCode());
        hashCode = prime * hashCode + ((getFailover() == null) ? 0 : getFailover().hashCode());
        hashCode = prime * hashCode + ((getMultiValueAnswer() == null) ? 0 : getMultiValueAnswer().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        hashCode = prime * hashCode + ((getResourceRecords() == null) ? 0 : getResourceRecords().hashCode());
        hashCode = prime * hashCode + ((getAliasTarget() == null) ? 0 : getAliasTarget().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceId() == null) ? 0 : getTrafficPolicyInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public ResourceRecordSet clone() {
        try {
            return (ResourceRecordSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
